package array;

import java.util.Scanner;

/*find the max element of an array
( প্রত্যেকটা element কে একটা আরেকটার সাথে তুলনা করি nested for loop use করে।)
 */
public class array_14 {

    static int call(int[] arr){
        //compare using nasted for loop
        int max=-1;
        for(int i=0; i<arr.length; i++){
                if(arr[i]>max) max=arr[i];
            }
        return max;
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
        int ans =call(arr);
        System.out.println("the biggest number of the array is :"+ans);
    }
}
