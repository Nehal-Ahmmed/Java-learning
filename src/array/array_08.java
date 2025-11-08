package array;

import java.util.Scanner;

//an array is given. is it sorted or not. sorted means sequence: increasing or decreasing.
public class array_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,3,5,3,7,8,9};
        int a=0;
         for(int i=0; i<arr.length-1;i++){
             if(arr[i]> arr[i+1]){
                 System.out.println("not sorted");
                 break;}
             else a++;
         }
         if(a==(arr.length-1)) System.out.println("sorted");
    }
}
