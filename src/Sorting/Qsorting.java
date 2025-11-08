package Sorting;

public class Qsorting {

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int pivot(int[] arr,int l,int r){

        int pi=l;
        int count=0;

        int i=l+1;
        while(i<=r){
            if(arr[i]<=arr[pi]){
                count++;
            }
            i++;
        }

        int pivot_index=l+count;

        swap(arr,pivot_index,pi);



        int j=l,k=r;
        while(j<pivot_index && k>pivot_index ){
            while(arr[j]<=arr[pivot_index]) j++;
            while(arr[k]>arr[pivot_index]) k--;

            if(j<pivot_index && k>pivot_index ){
                swap(arr,k,j);
                j++;
                k--;
            }
        }

        return pivot_index;

    }

    public static void rec(int[] arr,int l,int r){
        if(l<r){
            int pi=pivot(arr,l,r);
            if(pi!=0) rec(arr,l,pi-1);
            if(pi!=r) rec(arr,pi+1,r);
        }
    }


    public static void main(String[] args) {
        int[] arr={5,78,6,8,8,2};
        rec(arr,0,arr.length-1);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }

}