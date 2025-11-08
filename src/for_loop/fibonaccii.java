package for_loop;
import java.util.Scanner;
public class fibonaccii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");

        int n=sc.nextInt();
        int a=1;
        int b=1;
        System.out.print(1+" ");
        System.out.print(1+" ");
       if(n>2) {
           for (int i = 1; i <= n - 2; i++){
               int temp=b;
               b=a+b;
               a=temp;
               System.out.print(b+" ");
           }

       }
    }
}
