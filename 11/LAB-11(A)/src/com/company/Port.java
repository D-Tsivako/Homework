package com.company;

public class Port extends Thread {
    Dock[] docks;
    Ship[] ships;
    Port(Dock[] docks,Ship[] ships){
        this.docks=docks;
        this.ships=ships;
    }
    public void run(){
        for(Dock dock:docks){
            dock.start();
        }
        for(int i=0;i<ships.length;){
            for (Dock dock : docks) {
                if (dock.ship == null) {
                    dock.ship = ships[i];
                    i++;
                    break;
                }
            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Dock dock:docks){
            dock.interrupt();
        }
        System.out.println();
        for(Dock dock:docks){
            System.out.println("Dock "+dock.name+" has "+dock.goods+" goods");
        }
        System.out.println();
        for(Ship ship:ships){
            System.out.println("Ship"+ship.name+" has "+ship.goods+" goods");
        }
        System.out.println();
    }
}
