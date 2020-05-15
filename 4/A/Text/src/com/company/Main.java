package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Text text=new Text();
        while(true){
            int n=0;
            System.out.println("1)Show\n" +
                    "2)Get header\n" +
                    "3)Add sentence\n" +
                    "0)Exit");
            try{
                n=scanner.nextInt();
            }catch (InputMismatchException e){
                System.err.println(e);
            }
            switch (n){
                case 1:
                    text.show();
                    break;
                case 2:
                    System.out.println("Header: "+text.getHeader());
                    break;
                case 3:
                    text.addSentence();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Error!");
            }
        }
    }
}
