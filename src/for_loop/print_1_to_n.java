package for_loop;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class print_1_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("The sequence is :  ");
        for(int i=1; i<=n; i++){
            System.out.print( i+" " );
        }

    }
}
