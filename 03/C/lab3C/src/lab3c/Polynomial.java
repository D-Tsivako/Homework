package lab3c;

public class Polynomial {
    private int size;
    private Fraction[] coefficients ;

    public Polynomial(){
        super();
        this.size = 0;
        this.coefficients=new Fraction[size];
    }
    public Polynomial(int size,Fraction[] c){
        this.size = size;
        coefficients = new Fraction[size];
        for(int i=0;i<size;i++) {
            coefficients[i]=new Fraction();
            this.coefficients[i].setFraction(c[i].getX(), c[i].getY());
        }
    }

    public void setPolynomial(int size,Fraction[] c){
        //super();
        this.size = size;
        coefficients = new Fraction[size];
        for(int i=0;i<size;i++) {
            coefficients[i]=new Fraction();
            this.coefficients[i].setFraction(c[i].getX(), c[i].getY());
        }
    }
    public int getSize(){
        return this.size;
    }
    public Fraction getFraction(int num){
        return this.coefficients[num];
    }

    public Polynomial add(Polynomial p2) {
        int newSize=0;
        if(this.size<p2.getSize()) newSize=p2.getSize();
        else newSize=this.size;
        Fraction[] newC=new  Fraction[newSize];
        int delta=this.size-p2.getSize();

        for(int i=0;i<Math.abs(delta);i++){
            newC[i]=new  Fraction();
            if(delta==0);
            else if(delta>0) newC[i]=this.coefficients[i];
            else if(delta<0) newC[i]=p2.getFraction(i);
        }
        for(int i=Math.abs(delta),j=0;i<newSize;i++,j++){
            newC[i]=new  Fraction();
            if(delta>0) newC[i]=this.coefficients[i].add(p2.getFraction(j));
            if(delta<0) newC[i]=this.coefficients[j].add(p2.getFraction(i));
        }

        return new Polynomial(newSize,newC);
    }
    public String toStringPoly() {
        String s="";
        for (int i=size,j=0;i>=0;i--,j++)
        {
            if(i>1) s+=this.coefficients[j].toString()+"*x^"+(i-1)+" + ";
            if(i==1) s+=this.coefficients[j].toString();
        }
        return s;
    }
}
