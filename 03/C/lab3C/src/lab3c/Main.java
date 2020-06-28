package lab3c;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Polynomial  p1 = new Polynomial(),p2 = new Polynomial(),p = new Polynomial();
        int x,y,size;
        Fraction c[];

        System.out.println("Введите размер первого полинома");
        size = in.nextInt();
        c = new Fraction[size];
        for(int i = 0; i < size; i++)
            c[i] = new Fraction();
        System.out.println("Введите коэфициенты первого полинома");
        for(int i = 0, j = 1; i < size; i++, j++) {
            System.out.print(j + ")");
            x = in.nextInt();
            y = in.nextInt();
            c[i].setFraction(x,y);
        }
        p1.setPolynomial(size,c);

        System.out.println("Введите размер второго полинома");
        size = in.nextInt();
        c = new Fraction[size];
        for(int i = 0; i < size; i++)
            c[i] = new Fraction();
        System.out.println("Введите коэфициенты второго полинома");
        for(int i = 0, j = 1; i < size; i++, j++) {
            System.out.print(j + ")");
            x = in.nextInt();
            y = in.nextInt();
            c[i].setFraction(x,y);
        }
        p2.setPolynomial(size,c);

        p=p1.add(p2);

        System.out.println(p1.toStringPoly());
        System.out.println(p2.toStringPoly());
        System.out.println(p.toStringPoly());

    }
}

