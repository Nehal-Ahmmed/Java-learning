package array;
//count the numbers of duplets whose sum is equal to a given value x;
import java.util.Scanner;

public class array_11 {

    static int count(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[i]+arr[j]==target)
                    ans++;

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter an array of 5 numbers :");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter a value of x: ");
        int x=sc.nextInt();

        int ans=count(arr,x);
        System.out.println(ans);


    }
}
