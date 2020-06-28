package com.company;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bouquet implements Serializable {
    int numberOfFlowers;
    Flower[] flowers;
    public static boolean tape;
    boolean wrapper;

    Bouquet() {
        Scanner scanner = null;
        try {
            FileReader fr = new FileReader("text\\flowers.txt");
            scanner = new Scanner(fr);
            while (scanner.hasNext()) {
                scanner.nextLine();
                numberOfFlowers++;
            }
            fr = new FileReader("text\\flowers.txt");
            scanner = new Scanner(fr);
            flowers = new Flower[numberOfFlowers];
            for (int i = 0; i < numberOfFlowers; i++) {
                flowers[i] = new Flower(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }finally {
            if(scanner!=null)
                scanner.close();
        }
    }
    Bouquet(boolean bool){
        DataBase dataBase = new DataBase();
        try {
            String sql = "SELECT type,cost,freshLevel,stemLength FROM flowers.flowers";
            ResultSet resultSet = dataBase.statement.executeQuery(sql);
            ArrayList<Flower> flowers = new ArrayList<>();
            while(resultSet.next()){
                numberOfFlowers++;
                flowers.add(new Flower(resultSet.getString(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4)));
            }
            this.flowers=new Flower[numberOfFlowers];
            for(int i=0;i<numberOfFlowers;i++)
                this.flowers[i]=flowers.get(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void addOrRemoveTape() {
        tape = !tape;
    }

    void addOrRemoveWrapper() {
        wrapper = !wrapper;
    }

    int getCost() {
        int cost = 0;
        for (int i = 0; i < numberOfFlowers; i++)
            cost += flowers[i].cost;
        if (tape)
            cost += 1;
        if (wrapper)
            cost += 3;
        return cost;
    }

    void addFlower() throws FlowerLogicException {
        Flower[] flowers = this.flowers;
        numberOfFlowers++;
        this.flowers = new Flower[numberOfFlowers];
        for (int i = 0; i < numberOfFlowers - 1; i++)
            this.flowers[i] = flowers[i];
        this.flowers[numberOfFlowers - 1] = new Flower();
    }
    void sort(){
        try(FileWriter fw=new FileWriter("text\\sort.txt")){
            for(int i=0;i<numberOfFlowers;i++)
                for(int j=0;j<numberOfFlowers-i-1;j++)
                    if(flowers[j].freshLevel>flowers[j+1].freshLevel) {
                        Flower flower=flowers[j];
                        flowers[j] = flowers[j + 1];
                        flowers[j+1]=flower;
                    }
            for(int i=0;i<numberOfFlowers;i++){
                fw.write(flowers[i].toString());
                fw.append("\n");
            }
        }catch (IOException e){
            System.err.println(e);
        }
    }
    Flower findFlower(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Min length: ");
        int min=scanner.nextInt();
        System.out.print("Max length: ");
        int max=scanner.nextInt();
        for(int i=0;i<numberOfFlowers;i++){
            if(flowers[i].stemLength>=min && flowers[i].stemLength<=max){
                return flowers[i];
            }
        }
        return new Flower("Not Found", 0,0,0);
    }
    void show() {
        for (int i = 0; i < numberOfFlowers; i++) {
            System.out.println("Flower number " + (i + 1) + ":");
            flowers[i].show();
            System.out.println();
        }
        System.out.println("Tape: " + tape + "\nWrapper: " + wrapper+"\n");
    }
}
