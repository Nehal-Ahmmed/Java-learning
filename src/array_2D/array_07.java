package array_2D;
// print a pascal triangle of n row
//here, concept of jagged array is used
//jagged array--> it's a 2 D array where number of rows is defined but columns is not defined.
//ig...--> int[3][] arr it's a jagged array. array declare করার সময় jagged array create করা যায়। কিন্তু অন্য কোথাও এভানে লেখা যায় না।
//ig. int[][] arr= new int[4][];
// সেক্ষেত্রে এরে এর উভয় বক্স ফিলাপ করতে হয়।

import java.util.Scanner;

import static array_2D.print_array.print;

public class array_07 {

    static int[][] pascal(int n){
        int[][] arr=new int[n][]; //----->jagged array

        for(int i=0; i<n; i++){
            arr[i]=new int[i+1];
            arr[i][0]= arr[i][i]= 1;
            for(int j=1; j<i; j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n= sc.nextInt();
        System.out.println("pascal triangle is: ");
        int[][] ans=pascal(n);
        print(ans);

    }
}
