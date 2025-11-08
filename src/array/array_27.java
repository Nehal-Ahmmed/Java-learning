package array;

/*Given an array of integers of size n. Answer q quires
where you need to print the sum of values in a given range of indices from l to r (both included).
Note: the values of l and r in queries follow 1-based indexing.
 */

import java.util.Scanner;

public class array_27 {
    static void prefix_sum(int [] arr,int l,int r){
        for(int i=l; i<=r; i++){
            arr[i]+=arr[i-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n=sc.nextInt();
        System.out.println("enter an array of "+n+" size : ");
        int [] arr=new int[n];
        for(int i=1; i<=arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of queries: ");
        int q=sc.nextInt();
        int l,r;
        while(q-->0) {
            System.out.println("enter range: ");
            l=sc.nextInt();
            r=sc.nextInt();
            prefix_sum(arr, l, r);
        }
    }
}
