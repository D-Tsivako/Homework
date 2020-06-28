package task_10;

import java.net.ServerSocket;
import java.util.Scanner;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета\n" +
                "по кругу вычеркивается каждый второй человек, пока не останется один.\n" +
                "Составить две программы, моделирующие процесс. Одна из программ\n" +
                "должна использовать класс ArrayList, а вторая — LinkedList. Какая из двух\n" +
                "программ работает быстрее? Почему?");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer n = scanner.nextInt();
        scanner.close();

        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();


        Random rand = new Random();
        for (int i = 1; i <= n; i++) {
            arrList.add(i);
            linkList.add(i);
        }

        long start = System.currentTimeMillis();

        Integer index = 1;
        while (arrList.size() != 1) {
            for (int i = 0; i < arrList.size(); i++) {
                if (index == 2) {
                    arrList.remove(i);
                    index = 1;
                    if (i == arrList.size()) {
                        index = 0;
                    }
                }
                index++;
//                for (Integer in : arrList) {
//                    System.out.println(in);
//                }
//
//                System.out.println("index" + i + index + " \n");
            }
        }

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Время для ArrayList: " + timeElapsed);

        for (Integer in : arrList) {
            System.out.println(in);
        }



        start = System.currentTimeMillis();
        index = 1;
        while (linkList.size() != 1) {
            for (int i = 0; i < linkList.size(); i++) {
                if (index == 2) {
                    linkList.remove(i);
                    index = 1;
                    if (i == linkList.size()) {
                        index = 0;
                    }
                }
                index++;
            }
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Время для LinkedList: " + timeElapsed);

        for (Integer in : linkList){
            System.out.println(in);
        }

    }

}
