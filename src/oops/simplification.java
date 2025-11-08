package oops;
//simplify a fraction.
public class simplification {

    public static int gcd(int a,int b){
        int min=Math.min(a,b);
        for(int i=min; i>=1; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }

    public static fraction simpify(fraction f1){
        int gcd=gcd(f1.num,f1.den);
        f1.num/=gcd;
        f1.den/=gcd;

        fraction f3=new fraction(f1.num, f1.den);
        return f3;
    }
    public static class fraction{
        int num;
        int den;

        //constructor
        public fraction(int num,int den){
            this.num=num;
            this.den=den;
        }
    }

    public static void main(String[] args) {
        fraction f1=new fraction(2,6);
        fraction f3=simpify(f1);
        System.out.println(f3.num+"/"+f3.den);
    }
}
