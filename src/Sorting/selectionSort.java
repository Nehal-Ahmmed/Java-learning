package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={3,2,6,1,7,5,9,8};
        System.out.println("The given array is: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();

        int min_idx=0;
        for(int i=0; i<arr.length-1; i++){
            min_idx=i;
            for(int j=i+1; j<arr.length ; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i] =arr[min_idx];
            arr[min_idx]=temp;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
