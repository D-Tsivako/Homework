package com.company;

public class Dock extends Thread {
    String name;
    int goods;
    Ship ship;

    Dock(String name, int goods) {
        this.goods = goods;
        this.name = name;
    }

    public void run() {
        while (true) {
            if (ship != null) {
                System.out.println("Ship " + ship.name + " arrived at the dock "+this.name);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int a = (int) (Math.random() * 3);
                if (a == 0) {
                    System.out.println("Ship " + ship.name + " unloads the product");
                    this.goods=this.goods+ship.goods;
                    if(goods>600){
                        this.goods=600;
                        ship.goods=goods-600;
                    }
                } else if (a == 1) {
                    System.out.println("Ship " + ship.name + " loads the product");
                    ship.goods=this.goods+ship.goods;
                    if(ship.goods>200){
                        this.goods=ship.goods-200;
                        ship.goods=200;

                    }
                } else {
                    System.out.println("Ship " + ship.name + " unloads and loads the product");
                    int goods=this.goods;
                    this.goods=ship.goods;
                    ship.goods=goods;
                    if(ship.goods>200){
                        this.goods=ship.goods-200;
                        ship.goods=200;
                    }
                }
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ship "+ship.name+" sail away");
                ship=null;
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
