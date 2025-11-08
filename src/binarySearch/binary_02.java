package binarySearch;

import java.util.Scanner;

//recursively binary search implementation
public class binary_02 {

    static boolean recBinarySearch(int[] arr,int st,int end,int target){
        if(st>end) return false;
        int mid=(st+end)/2;
        if(target==arr[mid]){
            return true;
        }
        else if(target>arr[mid]){
            return recBinarySearch(arr,mid+1,end,target);
        }
        else{
            return recBinarySearch(arr,st,mid-1,target);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("the given sorted array is: ");
        for(int val:arr){          //for each loop
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("enter the target element here: ");
        int target=sc.nextInt();
        int st=0;
        int end=arr.length-1;
        System.out.printf("the element %d is present in the array: %b ",target,recBinarySearch(arr,st,end,target));
    }
}
