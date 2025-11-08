package recursion;
 import java.util.Scanner;
public class E_sum_of_digits {

    static int sumofdigits(int n){
        //base case
        if(n>=0 && n<=9) {
            return n;
        }
        //recursive call+self work
        return sumofdigits(n/10)+n%10;

    }


    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");

    int n = sc.nextInt();
        System.out.println(sumofdigits(n));
}
}
