package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

//sum of rectangle using pre-calculating the horizontal sum for each row.
public class array_11 {

    static void prefixsum(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0; i<r; i++ ){
            for(int j=1; j<c ; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    static int findsum(int[][] arr, int r1,int r2, int c1, int c2){
        int sum=0;
        prefixsum(arr);

        for(int i=r1; i<=r2; i++){
            if(c1>0)
            sum+=arr[i][c2]-arr[i][c1-1];
            else
                sum+=arr[i][c2];
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the order of the square matrix: ");
        int n = sc.nextInt();
        System.out.println(" the order of matrix is " + "(" + n + "*" + n + ")");
        System.out.println("enter " + n * n + " elements of the matrix");
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(" enter the co-ordinates : r1 r2 c1 c2 : ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        int ans=findsum(matrix,r1,r2,c1,c2);
        System.out.println(" the sum is : "+ans);
    }
}
