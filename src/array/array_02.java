package array;
//detacting the max value of an array
public class array_02 {
    public static void main(String[] args) {
    int[] arr = {4,2,5,1,3};
    int max=0;
    for(int i=0; i<arr.length ;i++){
        if(max<arr[i]){
            max=arr[i];
        }

    }
        System.out.println("the max value is= "+max);
}
}
