package array_2D;

import java.util.Scanner;

//sum of rectangle using brute force method.
public class array_10 {

    static int sum(int[][] arr , int r1, int r2, int c1, int c2){
        int sum=0;

        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum+=arr[i][j];
            }
        }


        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the order of the square matrix: ");
        int n=sc.nextInt();
        System.out.println(" the order of matrix is "+"("+n+"*"+n+")");
        System.out.println("enter "+n*n+" elements of the matrix");
        int[][] matrix=new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println(" enter the co-ordinates : r1 r2 c1 c2 : ");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();

        int ans=sum(matrix,r1,r2,c1,c2);
        System.out.println(" the sum is : "+ans);

    }

}
