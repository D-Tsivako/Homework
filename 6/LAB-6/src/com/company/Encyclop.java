package com.company;

public class Encyclop extends Book {
    private String adultOrChild;

    public Encyclop(int id, String name, String author, int year, String publishHouse, String country,String adultOrChild) {
        super(id, name, author, year, publishHouse, country);
        this.adultOrChild=adultOrChild;
    }

    @Override
    public String toString() {
        return "Handbook: "+'\n'+super.toString()+'\n'+
                "For whom:"+this.adultOrChild;
    }

    @Override
    public void show() {System.out.println(this.toString());
    }
}
