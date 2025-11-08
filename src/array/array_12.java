package array;

import java.util.Scanner;

public class array_12 {
    static int call(int [] arr, int target ){
        int ans=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target)
                        ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("enter an array of 5 elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target value : ");
        int x=sc.nextInt();


        int ans=call(arr,x);
        System.out.println(ans);
    }
}
