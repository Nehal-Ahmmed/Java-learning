package array_2D;

import java.util.Scanner;

//print a given matrix in spiral sequence
public class array_08 {

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralmat(int[][] arr, int r, int c) {
        int leftcol = 0;
        int rightcol = c - 1;
        int toprow = 0;
        int botrow = r - 1;
        int printedelement = 0;

        while (printedelement < r * c){
            for (int j = leftcol; j <= rightcol && printedelement < r * c; j++) {
                System.out.print(arr[toprow][j] + " ");
                printedelement++;
            }
        toprow++;

        for (int i = toprow; i <= botrow && printedelement < r * c; i++) {
            System.out.print(arr[i][rightcol] + " ");
            printedelement++;
        }
        rightcol--;

        for (int j = rightcol; j >= leftcol && printedelement < r * c; j--) {
            System.out.print(arr[botrow][j] + " ");
            printedelement++;
        }
        botrow--;

        for (int i = botrow; i >= toprow && printedelement < r * c; i--) {
            System.out.print(arr[i][leftcol] + " ");
            printedelement++;
        }
        leftcol++;
    }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int r = sc.nextInt();
        System.out.println("enter column: ");
        int c = sc.nextInt();
        System.out.println(" the order of the matrix is "+"("+r+"*"+c+")");
        System.out.println("enter "+r*c+" elements of the matrix");
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the inputed matrix is : ");
        print(matrix);
        System.out.println("the spiral sequence is: ");
        spiralmat(matrix, r, c);

    }
}

