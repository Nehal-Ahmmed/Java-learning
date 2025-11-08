package oops;
/*
1. addition of two fractions. 2. numerator means লব। denominator means হর। 3. simplification of a fraction.
 */
public class class_07 {

    //creating a new function for pick up the addition
    public static fraction addition(fraction f1,fraction f2){
        /*
        1/2 +1/2 => {(1*2)+(1*2)}/2*2
         */
        int numerator=f1.den*f2.num + f1.num*f2.den;
        int denominator=f1.den*f2.den;
        fraction f3=new fraction(numerator,denominator);
        return f3;
    }

    public static class fraction{
        int num;
        int den;

        //constructor function
        public fraction(int num, int den){
            this.num=num;
            this.den=den;
        }
    }

    public static void main(String[] args) {
        fraction f1=new fraction(1,2);
        fraction f2=new fraction(1,2);
        fraction f3=addition(f1,f2);
        System.out.println("the additoin is : "+f3.num+"/"+f3.den);
    }
}
