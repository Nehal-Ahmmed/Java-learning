package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

//Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order.
public class array_09 {

    static void makingmatrix(int n) {
        int[][] arr = new int[n][n];
        int leftcol = 0;
        int rightcol = n - 1;
        int toprow = 0;
        int botrow = n - 1;
        int count = 0;


        while(n*n>count) {
        for (int j = leftcol; j <= rightcol; j++) {
            arr[toprow][j] = ++count;
        }
        toprow++;

        for (int i = toprow; i <= botrow; i++) {
            arr[i][rightcol] = ++count;
        }
        rightcol--;

        for (int j = rightcol; j >= leftcol; j--) {
            arr[botrow][j] = ++count;
        }
        botrow--;

        for (int i = botrow; i >= toprow; i--) {
            arr[i][leftcol] = ++count;
        }
        leftcol++;
    }
 print(arr);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order of the matrix : ");
        int n=sc.nextInt();
        System.out.println("the arranged matrix is :");
        makingmatrix(n);

        System.out.println("");
    }
}
