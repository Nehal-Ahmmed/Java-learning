package for_loop;
import java.util.Scanner;
public class factorial02 {
    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
            System.out.println("The value of "+i+" factorial is "+fact);
        }
    }
}
