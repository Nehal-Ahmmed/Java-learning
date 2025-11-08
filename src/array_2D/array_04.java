package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

//multiplication of two matrixes.
public class array_04 {


    public static void main(String[] args) {

        //start taking inputs

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
        System.out.println("Matrix B: \n enter row: ");
        int rB= sc.nextInt();
        System.out.println("Matrix B: \n enter column: ");
        int cB= sc.nextInt();
        System.out.println(" the order of matrix B is "+"("+rB+"*"+cB+")");
        System.out.println("enter "+rB*cB+" elements of the matrix");
        int[][] matB=new int[rB][cB];
        for(int i=0; i<matB.length;i++){
            for(int j=0; j< matB[i].length; j++){
                matB[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix A :");
        print(matA);
        System.out.println("matrix B : ");
        print(matB);

        //end taking inputs

        mul(matA,rA,cA,matB,rB,cB);
    }

    private static void mul(int[][] matA, int rA, int cA, int[][] matB, int rB, int cB) {
        if(cA!=rB) {
            System.out.println(" multiplication is not possible . ");
            return;
        }
        int[][] mul=new int[rA][cB];
        for(int i=0; i<rA; i++){
            for(int j=0; j<cB ; j++){
                for(int k=0; k<cA; k++){
                    mul[i][j]+=matA[i][k]*matB[k][j];
                }
            }
        }
        System.out.println(" the multiplication of matrix A and matrix B is : ");
        print(mul);
    }

}
