package Sorting;
//divide & rule
public class quickSorting {

    static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

    }

    //set the pivot in it's right place
   static int sortPivot(int[] arr,int l,int r){
       int pivot=arr[l];
       int count=0;

       int i=l+1;
        while(i<=r){

            if(pivot>=arr[i]){
                count++;
            }
            i++;
        }
        int pivotIdx=l+count;
        swap(arr,l,pivotIdx); //pivot got its right place

        //equal or smaller than pivot element ->left of pivot
       int j=l,k=r;
       while(j<pivotIdx && k>pivotIdx){

           //skip the right placed elements
           while (arr[j]<=pivot) j++;
           while(arr[k]>pivot) k--;

           //swaping
           if(j<pivotIdx && k>pivotIdx){
               swap(arr,j,k);
               j++;
               k--;
           }

       }


        return pivotIdx;

    }

    static void quickSort(int[] arr,int l, int r){

        if(l<r){
          int pi=sortPivot(arr,l,r);
          if(pi!=0) quickSort(arr,l,pi-1);
           if(pi!=r) quickSort(arr,pi+1,r);

        }

    }

    static void display(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={3,6,9,7,6,7,5,8,1,2};
        System.out.println("the unsorted part is : ");
        display(arr);

        quickSort(arr,0,arr.length-1);

        System.out.println("the sorted array is: ");
        display(arr);

    }

}
