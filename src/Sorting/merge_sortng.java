package Sorting;
//merge sorting
public class merge_sortng {


    void merge(int[] arr,int l, int r,int m){ //এটাই আসল কাজ

        //divide the array into two sub array
        //pick out the size of the two sub arrays
        int n1=m-l+1;
        int n2=r-m;

        int[] L=new int[n1];
        int[] R=new int[n2];

        //include elements into the sub arrays
        for(int i=0; i<n1; i++){
            L[i]=arr[l+i];
        }

        for(int j=0; j<n2; j++){
            R[j]=arr[m+1+j];
        }

        //merging two different subarray:
        int k=l; //the index of merged sorted array. k =l because in each call , k should not be 0 everytime
         int i=0,j=0; //temporary index of the two sub array


        //compariosn & including elements
        while( i<n1 && j<n2  ){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }

            k++;

        }
//যদি কোনো sub array এর element include করা বাকি থেকে যায়ঃ
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }

    //recurssive call
    //এটায় আসলে এরে কে divide করে দেয়।
    void sort(int[] arr,int l,int r){
        if(l<r){
            int m=(l+r)/2; //সীমানা নির্ধারন করলাম

            sort(arr,l,m); //প্রথম অর্ধেক আলাদা করলাম
            sort(arr,m+1,r); //বাকিটা আলাদা করলাম

            merge(arr,l,r,m); //খন্ডাংশগুলোকে ক্রমানুসারে মার্জ করলাম
        }
    }

    void display(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
    }



    public static void main(String[] args){
        int[] arr={48,84,45,6,7,2,1,0};


        merge_sortng mrg=new merge_sortng();

        System.out.println("the given array is: ");
        mrg.display(arr);

        mrg.sort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("the sorted array is: ");
        mrg.display(arr);
        
    }


}
