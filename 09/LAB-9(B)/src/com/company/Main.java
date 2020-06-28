package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FlowerLogicException {
        Bouquet bouquet = new Bouquet(true);
        int k = 0;
        String file = "data\\demo.data";
        Serializator sz = new Serializator();
        SerializationFlow szFlow;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1)Show\n" +
                    "2)Add flower\n" +
                    "3)Add/Remove tape\n" +
                    "4)Add/Remove wrapper\n" +
                    "5)Sort\n6)Find Flower\n" +
                    "7)Give cost\n" +
                    "8)Serialization\n" +
                    "9)Deserialization\n" +
                    "0)Exit");
            try {
                k = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println(e);
                k = 0;
            }
            switch (k) {
                case 1:
                    bouquet.show();
                    break;
                case 2:
                    bouquet.addFlower();
                    break;
                case 3:
                    bouquet.addOrRemoveTape();
                    break;
                case 4:
                    bouquet.addOrRemoveWrapper();
                    break;
                case 5:
                    bouquet.sort();
                    break;
                case 6:
                    bouquet.findFlower().show();
                    break;
                case 7:
                    System.out.println("Cost: " + bouquet.getCost());
                    break;
                case 8:
                    szFlow = new SerializationFlow(sz, bouquet, file);
                    szFlow.serOrDeser = true;
                    szFlow.start();
                    break;
                case 9:
                    szFlow = new SerializationFlow(sz, bouquet, file);
                    szFlow.serOrDeser = false;
                    szFlow.start();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Error!");
            }
        }
    }
}
