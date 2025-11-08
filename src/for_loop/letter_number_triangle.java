package for_loop;
import java.util.Scanner;
public class letter_number_triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=4;
        int nst=1;
        int nsp=n-1;
        int letter=64;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=nsp; k++){
                System.out.print(" ");
            }
            nsp--;
            if(i%2!=0) {
                for (int j = 1; j <= nst; j++)
                    System.out.print(j+" ");
            }
            else{
                for(int j=1; j<=nst; j++){
                    char ch=(char)(letter+j);
                    System.out.print(ch+" ");

                }
            }
            nst+=2;
            System.out.println("\n");
        }
    }
}
