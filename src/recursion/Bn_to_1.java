package recursion;//5 4 3 2 1
import java.util.Scanner;

public class Bn_to_1 {

    static void fact(int n){
        //base case
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        //self work
        System.out.print(n+" ");




        //smaller prblm- recursive call
        fact(n-1);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
}
