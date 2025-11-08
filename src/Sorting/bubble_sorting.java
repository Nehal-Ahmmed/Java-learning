package Sorting;
/*
bubble sorting : এই process টা হলো loop system . প্রত্যেকবার লুপ চললে একটা করে number sort হবে। এর time complexity O(n^2).
space complexity O(1).
 */
public class bubble_sorting {
    public static void main(String[] args){
        int[] arr={6,7,3,5,1,2,4};
        for(int i=0; i<arr.length-1; i++){
            boolean flag=false; //has any swap.
            for(int j=0; j<(arr.length-i-1);j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}
