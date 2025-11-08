package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

// rotate a square matrix to 90 degree
//1. traspose the matrix
// 2. reverse each line or 1D array.
public class array_06 {

    static void transpose(int[][] arr,int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
//                arr[i][j]=arr[i][j]+arr[j][i]; (does not work.)
//                arr[j][i]=arr[i][j]-arr[j][i];
//                arr[i][j]=arr[i][j]-arr[j][i];


            }
        }
        System.out.println("the transposed matrix is: ");
        print(arr);

    }


    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=arr[temp];
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix A: \n enter row: ");
        int rA= sc.nextInt();
        System.out.println("Matrix A: \n enter column: ");
        int cA= sc.nextInt();
        System.out.println(" the order of matrix A is "+"("+rA+"*"+cA+")");
        System.out.println("enter "+rA*cA+" elements of the matrix");
        int[][] matA=new int[rA][cA];
        for(int i=0; i<matA.length;i++){
            for(int j=0; j< matA[i].length; j++){
                matA[i][j]=sc.nextInt();
            }
        }
        transpose(matA,rA);

        for(int i=0; i<rA; i++){
            reverse(matA[i]);
        }
        System.out.println("90 degree rotated matrix is :");
        print(matA);

    }
}
