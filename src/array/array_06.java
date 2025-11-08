package array;
//how much count of a defined integerin the array.

import java.util.Scanner;

public class array_06 {

    public static void arrprinter(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,5,4,7,8,9,4,7,5,7,9};
        System.out.println("the array is : ");
        arrprinter(arr);
        System.out.println("\nthe value of x is : ");
        int x=sc.nextInt();

        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        if(count==0)
            System.out.println("does not exist.");
        else if(count==1)
            System.out.println("the number "+x+" is "+count +" time in the array.");
        else
        System.out.println("the number "+x+" is "+count +" times in the array.");


    }
}
