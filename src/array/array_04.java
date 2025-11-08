package array;
// TAKING INPUTS IN ARRAYS.
/*INPUTS নেয়ার নিয়মঃ
১। for loop দিয়ে।
*method ba function call theke array return pawar jonno mehtod ba function
er type array type likhte hobe.
static int[] arrayneme(....){.......}
*/
import java.util.Scanner;

public class array_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
       int n=sc.nextInt();
        int[] arr=new int[n];

       //start for loop//
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

        //end//
    }
}
