package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FlowerLogicException {
        String file = "data\\demo.data";
        Serializator sz = new Serializator();
        Bouquet bouquet=new Bouquet();
        int k=0;
        while(true){

            Scanner scanner=new Scanner(System.in);
            System.out.println("1)Show\n2)Add flower\n3)Add/Remove tape\n4)Add/Remove wrapper\n5)Sort\n6)Find Flower\n7)Give cost\n0)Exit");
            try{
                k=scanner.nextInt();
            }catch (InputMismatchException e){
                System.err.println(e);
                k=0;
            }
            switch (k){
                case 1:bouquet.show();break;
                case 2:bouquet.addFlower();break;
                case 3:bouquet.addOrRemoveTape();break;
                case 4:bouquet.addOrRemoveWrapper();break;
                case 5:bouquet.sort();break;
                case 6:bouquet.findFlower().show();break;
                case 7:System.out.println("Cost: "+bouquet.getCost());break;
                case 0:System.exit(0);
                default:System.err.println("Error!");
            }
        }
    }
}
