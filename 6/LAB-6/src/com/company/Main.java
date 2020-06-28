package com.company;

public class Main {

    public static void main(String[] args) {
	Handbook handbook=new Handbook(1, "address/phones", 2014,"Minsk","Belarus",10000);
	Encyclop encyclop=new Encyclop(2, "Encyclop of professor Fortran", "A. Zaretcky, A. Truhanov", 1991,"Prosvyachenyie","CССР", "child" );
    handbook.show();
    encyclop.show();
    }
}
