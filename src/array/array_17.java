package array;
//reverse an array, process-01.
import java.util.Scanner;

public class array_17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter an array of "+n+" size: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int[] brr=new int[arr.length];
        int j=0;
        for(int i=n-1; i>=0; i--){
            brr[j++]=arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(brr[i]+ " ");
        }
    }

}
