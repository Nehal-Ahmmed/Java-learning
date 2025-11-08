package ABC_dsa_sheet;

public class minimum_number_of_merge_operation {

    static int merge_operation(int arr[]){
        int count=0;
        int n=arr.length;
        for (int i=0 , j=n-1; i<=j; ){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i+1];
                count++;
            }
            else {
                j--;
                arr[j]+=arr[j+1];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] =new int[]{1,4,5,1,8};
        System.out.println(merge_operation(arr));
    }
}
