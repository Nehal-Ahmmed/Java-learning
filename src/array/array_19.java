package array;

import java.util.Scanner;

//rotate the given array ' arr' by k steps where k is non negative .
//k can be greater than size of the array.
//অর্থাৎ k বার roatate করতে হবে।
/*
let,
arr={1 2 3 4 5}
k=1  5 1 2 3 4
k=2  4 5 1 2 3
k=3  3 4 5 1 2
k=4  2 3 4 5 2
k=5  1 2 3 4 5
তাহলে
k=6 হলে তা k%n বা k=1 এর সমতুল্য।
 */
public class array_19 {

    static void change(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] brr = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            brr[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            brr[j++] = arr[i];
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(brr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter an array of "+n+" size: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter k: ");
        int k=sc.nextInt();
        change(arr,k);
        }
    }


