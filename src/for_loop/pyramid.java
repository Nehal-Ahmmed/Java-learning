package for_loop;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nst=1,nsp=n-1;
    for(int i=1; i<=n; i++){
        int p=1;
        for(int j=1; j<=nsp; j++){
            System.out.print(" ");
        }
        nsp--;
        for(int j=1; j<=nst; j++){
            System.out.print(p);
            p+=2;
        }
        nst+=2;
        System.out.print("\n");
    }

}
}
