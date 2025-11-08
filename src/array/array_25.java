package array;

import static array.array_20.arrayprint;
import static array.array_23.swap;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Given an integer array 'a' sorted in non decreasong order ,
return an array of the squares of each number sorted in non
decreasing order.
 */
public class array_25 {

    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j])
                    swap(arr,i,j);
            }
        }
    }

    static int[] square(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= (int) pow(arr[i],2);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={-10,-3,-2,1,4,5};
        int a=arr.length;
        int i=0;
        while(0<a){
            if(arr[i]<0) arr[i]=arr[i]*(-1);
            a--;
            i++;
        }
        sort(arr);
        square(arr);
        arrayprint(arr);
    }
}
