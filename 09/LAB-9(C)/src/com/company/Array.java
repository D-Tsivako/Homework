package com.company;

import java.io.*;
import java.util.Random;

public class Array {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("massiv.txt");

        int[] nArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nArray[i] = random.nextInt(100) - 50;
        }

        System.out.println("Массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nArray[i] + " ");
        }

        //ЗАПИСЬ В ФАЙЛ
        try (final FileWriter writer = new FileWriter("massiv.txt", false)) {
            for (int a = 0; a < nArray.length; ++a) {
                final String s = Integer.toString(nArray[a]);
                writer.write(s);
                writer.write(System.lineSeparator());
                //System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        

        //СЧИТЫВАЕМ С ФАЙЛА
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("massiv.txt"))) {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        //СОРТИРУЕМ МАССИВ ПО ВОЗРОСТАНИЮ
        System.out.println("\nОтсортированный массив: ");
        if (array != null) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        //СОЗДАНИЕ ДИРЕКТОРИИ
        String fileName = "massif.txt";
        File newFile = new File(fileName);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File has been created");
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        //ЗАПИСЬ ОТСОРИРОВАННОГО МАССИВА В ФАЙЛ
        try (final FileWriter writer = new FileWriter(fileName, false)) {
            for (int a = 0; a < array.length; ++a) {
                final String s = Integer.toString(array[a]);
                writer.write(s);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}


