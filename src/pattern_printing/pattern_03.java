package pattern_printing;//ulta star triangle
import java.util.Scanner;
public class pattern_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int x=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=x; j++){
                System.out.print("*");
            }
            System.out.println("\n");

            x--;
        }
    }
}
