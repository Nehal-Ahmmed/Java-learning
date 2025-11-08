package array_2D;

import java.util.Scanner;

import static array_2D.print_array.print;

//calculate the sum of rectangle using smart process.
public class array_12 {

    static void sumofeachcolum(int[][] arr){   //-->it will bring me rectangular sum at the co-ordinate of (0,0) & (i,j)
        for(int j=0; j<arr[0].length; j++){
            for(int i=1; i<arr.length; i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

    static void sumofeachrow(int[][] arr){ //-->it will bring me the array by prefix sum row-wise.
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        sumofeachcolum(arr);
    }

    static int sumofrectangle(int[][] arr,int r1,int r2,int c1,int c2){
        int sum=0;
        sumofeachrow(arr);
        int totalsum=arr[r2][c2]    ,topsum=0,leftsum=0,commonsum=0;
        if(r1>0) topsum=arr[r1-1][c2];
        if(c1>0) leftsum=arr[r2][c1-1];
        if(r1>0 && c1>0) commonsum=arr[r1-1][c1-1];

        sum=totalsum-topsum-leftsum+commonsum;
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

       int ans= sumofrectangle(matrix,r1,r2,c1,c2);
        System.out.println(" the sum of the rectangle is: "+ans);

    }
}
