package com.company;

public class Handbook extends Book{
    private int numberOfPhones;
    public Handbook(int id, String name, int year, String publishHouse, String country, int numberOfPhones) {
        super(id, name, year, publishHouse, country);
        this.numberOfPhones=numberOfPhones;
    }

    public int getNumberOfPhones() {
        return numberOfPhones;
    }

    public void setNumberOfPhones(int numberOfPhones){this.numberOfPhones=numberOfPhones;}

    @Override
    public String toString() {
        return "Handbook: "+'\n'+ super.toString()+'\n'+
                "Number of phones:"+this.numberOfPhones;
    }

    @Override
    public void show(){
        System.out.println(this.toString());
    }
}
