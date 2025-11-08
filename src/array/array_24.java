package array;

import static array.array_20.arrayprint;
import static array.array_23.swap;
//TWO POINTERS


/* given an array of integers 'a' , move all the even integers at the
beginning of the array followed by all the odd integers.
the relative order of odd or even integers does not matter.
return any array that satisfies the condition.
 */
public class array_24 {
static void sort(int[] arr){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        if(arr[i]%2!=0 && arr[j]%2==0){
            swap(arr,i,j);
            i++;
            j--;
        }
        if(arr[i]%2==0 ) i++;
        if(arr[j]%2!=0) j--;
    }
}

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        sort(arr);
        arrayprint(arr);
    }
}
