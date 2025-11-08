package array;
//details of 1 D array.
public class array_01 {
    public static void main(String[] args) { //here 'public' is access modifier. 'static' হলো non acess modifier .
        //static keyword টি কোনো method বা function call করার সময় কাজে লাগে।
        //static keyword এর সাহায্যে কোনো object create করা ছাড়াই method call করা যায়।
       // int [] arr=new int [5]; এভাবে array declare করা যায়।
        int[] arr={1,2,3,4,5}; //এভাবেও array declare করা যায়।

        /*array print করার system তিনটা -
        ১। for loop দিয়ে ।
        ২। for each loop দিয়ে।- তবে এটা দিয়ে করলে সবটা array print হয়ে যাবে।
        এই পদ্ধতিতে মূলত একটি datatype declare করে তাতে array কে store করানো হয়।
        এবং তাকেই print করিয়ে দেয়া হয়।
        ৩।while looop দিয়ে।
         */

        //using for loop -
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //using "for each" loop-

        for(int x:arr){
            System.out.println(x);
        }

        //using "while " loop-
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }


        /* কোনো array এর length প্রকাশ করার জন্য arr.length এই attribute use হয়।
         */
        System.out.println(arr.length);

    }
}
