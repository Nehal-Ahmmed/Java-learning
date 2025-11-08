package recursion;

import java.util.Scanner;


public class Cfactorial {



    static int fact(int n){
        //base case
        if(n==1) return 1;

        //smaller problem-recursive call
        int sfact=fact(n-1);

        //self work
        return n*sfact;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x= fact(n);
        System.out.println(x);
    }
}

