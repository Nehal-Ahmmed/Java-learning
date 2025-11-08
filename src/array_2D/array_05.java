package array_2D;

import static array_2D.print_array.print;

//pick out the transpose of a matrix.
public class array_05 {

//    static int[][] swaping(int[][] arr,int i,int j){
//
//        i=i+j;
//        j=i-j;
//        i=i-j;
//        return arr[i][j];;
//    }

    public static void main(String[] args) {
        int[][] matA={  {1,2,3}, {4,5,6}, {7,8,9}  };
        System.out.println("the given matrix is : ");
        print(matA);
        System.out.println("rows: "+matA.length);
        System.out.println("columns: "+matA[0].length);

        int r=matA.length;
        int c=matA[0].length;

        //creating extra variable
        System.out.println("creating extra variable ");
        int[][] matB=new int[c][r];
        System.out.println(" transpose of the matrix is: ");

        for(int i=0; i<c; i++){
            for(int j=0; j<r ; j++){
                matB[i][j]=matA[j][i];
            }
        }
        print(matB);

        //without creating extra variable
        System.out.println("//without creating extra variable:");
        System.out.println("the transpose of the matrix is: ");

        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp=matA[i][j];
                matA[i][j]=matA[j][i];
                matA[j][i]=temp;
            }
        }
        print(matA);

    }


}
