package array_2D;
//how to print a 2D array
public class print_array {
    public static void print(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
