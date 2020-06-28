package com.company;

public class Main {

    public static void main(String[] args) {
        Dock[] docks=new Dock[3];
        Ship[] ships=new Ship[20];
        for(int i=0;i<docks.length;i++){
            docks[i]=new Dock("Dock#"+(i+1),(int)(Math.random()*600));
            System.out.println("Dock "+docks[i].name+" has "+docks[i].goods+" goods");
        }
        System.out.println();
        for(int i=0;i<ships.length;i++){
            ships[i]=new Ship("Ship#"+(i+1),(int)(Math.random()*200));
            System.out.println("Ship "+ships[i].name+" has "+ships[i].goods+" goods");
        }
        System.out.println();
        Port port=new Port(docks,ships);
        port.start();
    }
}
