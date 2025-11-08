package pattern_printing;

import java.util.Scanner;

public class pattern_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value row: ");
        int n = 7;
        int nsp = n-1;

        for(int i=1; i<=n; i++){
            int a=1;


            for(int p=nsp; p>=1;p--){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(a);
                a++;
            }
            a-=2;
            for (int k=1; k<=i-1; k++){
                System.out.print(a);
                a--;
            }
            nsp--;
            System.out.println();
        }

    }
}
