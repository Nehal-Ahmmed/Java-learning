package for_loop;
import java.util.Scanner;
public class special_02 {

    static int sfn(int i,int j){
        if(i<j) return i;
        else return j;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int in,jn;
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                if(i<=n) in=i;
                else in=2*n-i;
                if(j<=n) jn=j;
                else jn=2*n-j;

                System.out.print( sfn(in,jn));
            }
            System.out.print("\n");
        }
    }
}
