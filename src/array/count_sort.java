package array;

public class count_sort {

    static int maxElement(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    static void frequency(int[] arr){
        int n=maxElement(arr)+1; //size of frqncy array

        //make frqncy array:
        int[] frequency=new int[n];
        for(int i=0; i<arr.length; i++){
            frequency[arr[i]]++;
        }
        
        //sort
        int k=0;
        for(int i=0; i<frequency.length; i++){
            for(int j=1; j<=frequency[i];j++){
                arr[k++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={8,8,9,0,4,7,3,3,2,9,3,2,3,4,6,8,6,0,0,4,0,6,0,4,0,2};
        frequency(arr);

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
