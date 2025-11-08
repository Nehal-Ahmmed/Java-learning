package recursion;
import java.util.Scanner;

public class D_fibonaccii {

    static int fib(int n){
        //base case
        if(n==0 || n==1) return n;
        //recursion
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n-1; i++)
        {
        System.out.print(fib(i)+" ");
    }
    }

}
