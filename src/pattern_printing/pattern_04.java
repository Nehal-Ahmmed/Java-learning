package pattern_printing;
import java.util.Scanner;
public class pattern_04 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value row: ");
        int n=sc.nextInt();
        int nst =n-1;
        int nsp= 1;
        for(int i=1;i<=2*n-1; i++ ) System.out.print("*");
        System.out.println("\n");
        for(int i=1; i<n; i++){
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }
            for(int k=1; k<=nsp; k++){
                System.out.print(" ");
            }
            nsp+=2;
            for(int j=1; j<=nst; j++){
                System.out.print("*");

            }
            nst--;
            System.out.println("\n");
        }
    }




}
