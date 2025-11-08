package array;

import java.util.Scanner;

/*find the second max element of an array. এটার আরেকটা process আছে । যা array_16 এ
লেখা হলো।
steps-
১। firstly , pick out(নির্ণয় কর) the max value
২। then pick out the second max value
   minimum value & maximum value নেয়ার জন্য -
 */
public class array_15 {

    static int call(int [] arr){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax ){
                smax=arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter an array of "+n+" size: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int ans=call(arr);
        System.out.println("the second max value is : "+ans);
    }
}
