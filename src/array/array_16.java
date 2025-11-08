package array;

import java.util.Scanner;

/*find the max element of an array. second process
steps-
  using array manipulation (manipulate means - নিপুনভাবে ব্যবহার করা।)
 */
public class array_16 {

    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
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
        int max= max(arr);
        for(int i=0; i< arr.length; i++){
            if(arr[i]==max)
                arr[i]=Integer.MIN_VALUE;
        }
        int ans=max(arr);
        System.out.println("the second max value is : "+ ans);
    }
}
