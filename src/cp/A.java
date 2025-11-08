package cp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static int fun(int arr[],int n){
        int operation=0;

        Arrays.sort(arr);
        int p=0,q=n-1;
        for(int i=0; i<n/2; i++ ){
            if((arr[p]+arr[q])/2==0){
                break;
            }else if((arr[p]+arr[q])/2==0){
                i++;
            }
            operation=i;
        }

        return operation;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println(fun(arr,arr.length));


    }
}
