package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Flower {
    String type;            //вид цветка
    int cost;               //цена
    int freshLevel;         //уровень свежести
    int stemLength;         //длина стебля

    Flower(String type, int cost, int freshLevel, int stemLength) {
        this.type = type;
        this.cost = cost;
        this.freshLevel = freshLevel;
        this.stemLength = stemLength;
    }

    Flower() throws FlowerLogicException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type: ");
        type = scanner.next();
        System.out.print("Cost: ");
        try {
            cost = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println(e);
        } finally {
            scanner = new Scanner(System.in);
        }
        System.out.print("Fresh Level: ");
        try {
            freshLevel = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println(e);
        } finally {
            scanner = new Scanner(System.in);
        }
        System.out.print("Stem Length: ");
        try {
            stemLength = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println(e);
        }
        if (cost <= 0 || freshLevel <= 0 || stemLength <= 0) throw new FlowerLogicException("Illegal arguments!");
    }

    void show() {
        System.out.println("Type: " + type + "\nCost: " + cost + "\nFresh Level: " + freshLevel + "\nStem Length: " + stemLength);
    }
    public String toString(){
        return (type+"\t\t"+cost+"\t"+freshLevel+"\t"+stemLength);
    }
}
