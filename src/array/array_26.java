package array;
/*
Given an array 'a' , return the prefix sum/running sum
in the same array without creating a new array.
 */
import static array.array_20.arrayprint;

public class array_26 {
    static void prefix_sum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i]+arr[i-1];
        }


    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        prefix_sum(arr);
        arrayprint(arr);
    }
}
