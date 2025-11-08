package for_loop;//1 2 4 8 16 .....n th term
import java.util.Scanner;

import static java.lang.Math.pow;

public class Gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        //for(int i = 1; i<=pow(2,n-1); i*=2)
        for(int i=1,a=1; i<=n;i++){
            System.out.println(a+" ");
            a*=2;

        }

    }
}
