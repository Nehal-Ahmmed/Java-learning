package for_loop;//print n factorial
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the factorial: ");
        int n=sc.nextInt();
        int factorial=1;
//        while(n!=0){
//            factorial=factorial*n;
//            n--;
//        }
        for(int i=2; i<=n; i++){
            factorial=factorial*i;
        }
        System.out.println("factorial: "+factorial);

    }
}
