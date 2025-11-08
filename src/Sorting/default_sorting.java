package Sorting;

import java.util.Arrays;

public class default_sorting {


    public static void main(String[] args) {
        int[] arr={7,2,5,2,5,6,2,5,6,9};
        Arrays.sort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
