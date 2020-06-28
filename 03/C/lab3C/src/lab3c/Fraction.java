package lab3c;

public class Fraction {
    int x;
    int y;

    Fraction(){
        x = 0;
        y = 1;
    }

    public int getX(){ return x; }

    public int getY(){ return y; }

    private void setX(int a){ x = a; }

    private void setY(int a){ y = a; }

    public void setFraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + getX() + "/" + getY() + ")";
    }

    public Fraction add(Fraction b) {
        return new Fraction(x * b.y + y * b.x, y * b.y);
    }

    public void displayFraction(){
        //System.out.println("Числитель: " + x);
        //System.out.println("Знаменатель: " + y);
        System.out.println("Дробь: " + x + "/" + y);
    }
}
