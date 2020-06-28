package com.company;

public abstract class Book implements IPublish {
    protected int id;
    protected String name;
    protected String author;
    protected int year;
    protected  String publishHouse;
    protected String country;

    public Book(int id, String name, String author, int year, String publishHouse, String country){
        this.id=id;
        this.name=name;
        this.author=author;
        this.year=year;
        this.publishHouse=publishHouse;
        this.country=country;
    }

    public Book(int id, String name, int year, String publishHouse, String country) {
        this.id=id;
        this.name=name;
        this.year=year;
        this.publishHouse=publishHouse;
        this.country=country;
    }

    @Override
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String getPublishHouse() {
        return publishHouse;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Book №" +
                "id=" + id + '\n' +
                "| name: " + name  +
                "| author: " + author  +
                "| year: " + year +
                "| publishHouse: " + publishHouse  +
                "| country: " + country  +
                '|';
    }

    @Override
    public void show(){
        System.out.println(this.toString());
    };
}
