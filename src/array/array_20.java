package array;

import java.util.Scanner;

//rotate an array 'arr' by k steps where k is non negative . using better process.
public class array_20 {

    public static void reverse(int[] arr,int i, int j){
        int n=arr.length;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }


    }

    public static void arrayprint(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter an array of "+n+" size: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ente k: ");
        int k=sc.nextInt();
        k=k%n;
       reverse(arr,n-k,n-1);
       reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);

        arrayprint(arr);
    }
}
