package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

//calculate the of two matrixes.
public class array_03 {

    static void add(int[][] mat1,int r1,int c1,int[][] mat2 , int r2,int c2){
        int[][] sum=new int[r1][c1];
        if(r1!=r2 || c1!=c2) {
            System.out.println("the addition is not possible ");
            return;
        }

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j]= mat1[i][j] + mat2[i][j];
            }
        }

        print(sum);
        return;
    }

    public static void main(String[] args) {

        //creating Matrix 01:
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix 1: ");
        System.out.print("enter rows : ");
        int r1=sc.nextInt();
        System.out.print("enter columns: ");
        int c1=sc.nextInt();
        int[][] mat1=new int[r1][c1];
        System.out.println("the oreder of matrix 1 is: "+ "("+r1+"*"+c1+").\nenter "+r1*c1+" elements of the matrix :");

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                mat1[i][j]=sc.nextInt();
            }
        }


        //creating Matrix 02:
        System.out.println("Matrix 2: ");
        System.out.print("enter rows : ");
        int r2=sc.nextInt();
        System.out.print("enter columns: ");
        int c2=sc.nextInt();
        int[][] mat2=new int[r2][c2];
        System.out.println("the oreder of matrix 2 is: "+ "("+r2+"*"+c2+").\nenter "+r2*c2+" elements of the matrix :");
        for(int i=0; i<mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 01 is: ");
        print(mat1);
        System.out.println("Matrix 02 is: ");
        print(mat2);

        System.out.println("the addition is: ");
        add(mat1,r1,c1,mat2,r2,c2);

    }
}
