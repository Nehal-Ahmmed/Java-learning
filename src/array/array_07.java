package array;
//find the last occurance of an element x in a given array.
import java.util.Scanner;

public class array_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,2,3,5,6,7,5,8,9,6,5,9,3,5,6};
        System.out.println("the array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nenter the number: ");
        int x=sc.nextInt();
        int a=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                a=i;
            }
        }
        System.out.println("the last index is: "+a);
    }
}
