package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

//initializing a 2D array by taking inputs from the user.
public class array_02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows: ");
        int r=sc.nextInt();
        System.out.println("Columns: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("The order of the array is: " + "(" + r + "*" + c + ")" + " .\nEnter "+r*c+" elements of the array:");

        //taking input:

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given array is : ");
        print(arr);
    }

}
