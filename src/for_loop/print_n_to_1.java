package for_loop;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n=sc.nextInt();
        int x=n;
        for(int i=1; i<=n; i++){
            System.out.println(x);
            x--;
        }

    }
}
