package array;

import java.util.Scanner;

import static array.array_20.arrayprint;

/*
Sort (in increasing order) an array consisting of only 0s and 1s. (without using Array.sort()  class)
 */
public class array_22 {

    static int number_of_zeros(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) count++;
        }
        System.out.println(count);
        return count;
    }


    static int[] arraysort(int[] arr){
        int count=number_of_zeros(arr);
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(i<count) arr[i]=0;
            else arr[i]=1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={0,1,0,1,0,1,0,1};
//        System.out.println("enter the size of the array: ");
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.println("enter an array of "+n+" size: ");
//        for(int i=0; i<arr.length; i++){
//            arr[i]= sc.nextInt();
//        }

        arr=arraysort(arr);

        arrayprint(arr);
    }

}
