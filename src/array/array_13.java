package array;

import java.util.Scanner;

/* ARRAY MANIPULATION. -array তে একটি unique number থাকলে তা নির্নয় করাকে manipulation বলে।
steps-
1. nested for loop (double for loop) এর দ্বারা কোনো element দুইবার আছে কিনা তা নির্নয় করা এবং সনাক্ত করা।
2. আবার for loop use করে unique টাকে print করা ।
*/
public class array_13 {

    static int call(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) {
                arr[i]=-1;
                arr[j]=-1;
                }
                }
            }
        int ans=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) ans=arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an odd number:  ");
        int n=sc.nextInt();
        System.out.println("enter an array of "+n+" size :");
        int [] arr=new int[n];
        for( int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int ans= call(arr);
        System.out.println("the unique value is : "+ans);
    }
}
