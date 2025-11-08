package oops;
//writing fractional numbers using OOPS
//function for pick up smaller number between two numbers= Math.min(num1,num2);
//function for pick up GCD of two numbers
public class class_06 {
    public static class fraction { //'static' class এর ভিতরে কোনো function বানাতে হলে তাতে static keyword use করা হবে না।
        int dividend;
        int divisor;

        //creating constructor
        public fraction(int dividend, int divisor) {
            this.dividend = dividend;
            this.divisor = divisor;
           // simplify();
        }

        public int gcd() {
            int min = Math.min(dividend, divisor);
            for(int i = min; i >= 1; i--) {
                if (dividend % i == 0 && divisor % i == 0) return i;
            }
            return 1;

        }
        public void simplify() {
            int gcd = gcd(); //যেহেতু একই class এর ভিতরে সবকিছু ,তাই function create করার সময় কিছুই লিখতে হয় না bracket এ।
            dividend = dividend / gcd;
            divisor = divisor / gcd;
        }
    }

        public static void main(String[] args) {
            fraction f1 = new fraction(8, 4);
            System.out.println("The fraction is: "+f1.dividend + "/" + f1.divisor);
           f1.simplify(); //this function is not a function but an attribute of f1 object for main function.
            //function call চাইলে constructor এ ও করা যায়।(ig. inside the constructor function)
            System.out.println("The simplified form of the fraction is: "+f1.dividend + "/" + f1.divisor);
        }
}
