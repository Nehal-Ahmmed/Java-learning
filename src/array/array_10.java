package array;
/*
1.sort an given array.[ এখানে sorting মানে ছোটো থেকে বড় ক্রম। ]
    sorting করার জন্য আলাদা class file save করা আছে javaর util. library তে।
    সেটা হলো 'Arrays.sort(arrayname);'- এতে arrayname array টি sorted হয়ে arrayname এ
    sve হয়ে যাবে।
2.then print the first and last value of the sorted array.
3.bubble
4.selection sort
5.insertion sort
6.merge sort
7.quick sort   (Arrays.sort;)
8.count sort
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_10 {

//    static int [] sorting(int [] arr){     //method call function এ static keyword use করা হয় যখন
//         Arrays.sort(arr);                 //function কে কোনো static function থেকে call করা হয়।
//        int[] ans=arr; return ans;}            //কোনো static function ই অন্য কোনো static function এ
                                          //করতে পারে।
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("enter an unsorted array of size 5 : ");

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
//        int[] x=sorting(arr);
//        for(int y:x){
//            System.out.println(y);
//        }
        Arrays.sort(arr);
        //print array using for each loop
        System.out.println("the sorted array is: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("\nthe first element of the sorted array is "+arr[0]);
        System.out.println("the last element of the sorted array is "+arr[arr.length-1]);
    }
}
