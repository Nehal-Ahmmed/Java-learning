package recursion;
import java.util.Scanner;
public class Aprint_1to_n {

    static void rec(int n){
        if(n==1) {System.out.print(1);
            return;}
        rec(n-1);
        System.out.print(n);
        return;

    }

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");

    int n=sc.nextInt();
        System.out.println("the out put is: ");
    rec(n);
}
}
