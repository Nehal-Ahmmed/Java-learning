package array;
//2 pointers-swaping two values & reverse an array using swaping.Reversing process -2
import java.util.Scanner;

public class array_18 {

    static void swap(int a, int b){
        //method 1:
        System.out.println("before swap : a= "+a+" & b= "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping: a= "+a+" & b= "+b);
        return;
    }

    //method 2-
    static void swaping(int a,int b){
        System.out.println("before swap : a= "+a+" & b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping: a= "+a+" & b= "+b);
        return;
    }
        //reversing process -2= এই process এ array এর নাম change করতে হয় না।
     static void reverse(int[] arr){
        for(int i=0,j=arr.length-1; i<j; i++, j--){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("the numbers is :"+a+" "+b);

       // swap(a,b);    method 1
        //swaping(a,b);   //method 2

        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter an array of " + n + " size: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
}