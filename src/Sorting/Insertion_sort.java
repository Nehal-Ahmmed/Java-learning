package Sorting;
//insertion sorting an array
public class Insertion_sort {
    public static void main(String[] args){

        int[] arr={4,5,2,7,1,8,3};
        System.out.println("the given array is: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        int arrLength=arr.length;

        for(int i=1; i<arrLength; i++){
            for(int j=i; j>0; j-- ){

                if(arr[j]<arr[j-1]) {
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println("the sorted array is : ");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }

}
