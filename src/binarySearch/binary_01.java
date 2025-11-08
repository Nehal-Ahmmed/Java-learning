package binarySearch;
//binary search normally
import java.util.Scanner;

public class binary_01 {
    public static boolean search(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int middle=0;
        while(start<=end){
            middle=(start+end)/2;
            if(target==arr[middle]){
                return true;
            }
            else if(target<arr[middle]){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,34,56,89};
        System.out.println("enter the target element: ");
        int target=sc.nextInt();
        //new format of output. here, %s & %b is the format of string .
        System.out.printf("the number %d is present in the given array: %b \n",target,search(arr,target));
    }
}
