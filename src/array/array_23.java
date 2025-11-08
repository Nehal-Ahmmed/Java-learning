package array;
//TWO POINTERS

//Sort (in increasing order) an array consisting of only 0s and 1s

import java.util.Scanner;

import static array.array_20.arrayprint;

public class array_23 {

    static void swap(int [] arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];

    }

    static void sort_an_array(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1&& arr[j]==0) {
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,1,1,1,0,0,1,0,1,0,1};
        sort_an_array(arr);
        arrayprint(arr);
    }

}
