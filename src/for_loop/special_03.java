package for_loop;
import java.util.Scanner;
public class special_03 {

    static int bfn(int in,int jn){
        if(in>jn) return in;
        else return jn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int in=0,jn=0;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i<=n) in=n-i;
                if(j<=n) jn=n-j;
                System.out.print(bfn(in,jn));
            }
            System.out.print("\n");
        }

    }
}
