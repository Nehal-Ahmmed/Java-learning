package for_loop;
import java.util.Scanner;
public class special {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=5;
    int nst=n-1;
    int nsp=1;


    for(int i=1; i<=2*n-1; i++) System.out.print(i);
        System.out.print("\n");
    for(int i=1; i<=n; i++ ){
        int p=1;
        for(int j=1; j<=nst; j++){
            System.out.print(p);
            p++;
        }
        for(int j=1; j<=nsp; j++){
            System.out.print(" ");
            p++;
        }
        for(int j=1; j<=nst; j++){
            System.out.print(p);
            p++;
        }
        nsp+=2;
        nst--;
        System.out.print("\n");
    }
}
}
