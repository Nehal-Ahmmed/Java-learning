package array;

import java.util.Scanner;

//an array is given. is it sorted or not. sorted means sequence: increasing or decreasing.
//using boolean.
//IT IS A GOOD EXAMPLE OF BOOLEAN CONCEPT.
public class array_09 {
    public static boolean check(int [] arr){
        boolean ch=true;

        for(int i=0; i<(arr.length-1); i++){
            if(arr[i]>arr[i+1]) {
                ch = false;
                break;
            }
        }
        return ch;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter an array of "+n+" size:");
        for( int i=0; i<(n); i++){
            arr[i]=sc.nextInt();
        }

       boolean ch= check(arr);
        if(ch==true)
        System.out.println("sorted");
        else
            System.out.println("not sorted");


    }
}
