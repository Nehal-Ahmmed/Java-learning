package Stacks;

//we can have it in such a way that no extra space will be used
//for this: do not create the 'ans' array, direct make change in 'arr' array

public class next_greater_using_array_bruteForce {

    public static void next_greater(int[] arr){

        int[] ans=new int[arr.length];

        for (int i=0; i<arr.length; i++){
            ans[i]=-1;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        next_greater(arr);
    }
}
