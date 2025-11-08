package array;

import java.util.Arrays; //এটা 'Array' class use করার জন্য।

/*একতি array copy করার নিয়ম-
১। direct copy- main array এর ঠিকানা use করে dublicate array creat হবে।
    ফলে dublicate array এর change করলে main array ও change হবে।
2. clone copy- dublicate array এর change করলে main array ও change হবেনা।
৩। original copy-এটা .util library functin e save করা class 'Array' থেকে করা হয়। এটাও clone copy এর মতই।
 */
public class array_05 {

    public static void arrprint(int [] brr){
        for(int i=0; i<brr.length; i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        System.out.println("Main array: ");
        arrprint(arr);

        //direct copy -
        System.out.println("\nDirect copy: ");
        int[] darr=arr;
        arrprint(darr);

        //clone copy
        System.out.println("\nClone copy: ");
        int[] carr=arr.clone();
        arrprint(carr);

        System.out.println("\nAFTER MAKING CHANGE IN DIRECT COPY-\n direct copy array: ");
        darr[0]=0;
        darr[1]=0;
        arrprint(darr);
        System.out.println("\nmain array");
        arrprint(arr);
        /* এখানে pass by reference হওয়ায় duplicate এর সাথে সাথে original টাও change হয়ে যাচ্ছে।
        এখানে মূলত array size বড়। কিন্তু integer এর size ছোট। তাই integer তৈরি করলে শুধুমাত্র stack memory use হয়।
        কিন্তু array এর বেলায় heap memory ও use হয়। তাই pass by reference হয়। কিন্তু clone copy তে copy করার system
         আলাদা।
         */

        System.out.println("\nAFTER MAKING CHANGE IN CLONE COPY-\n array: ");
        carr[0]=0;
        carr[1]=0;
        carr[2]=0;
        carr[3]=0;
        carr[4]=0;
        System.out.println("\nclone copy-");
        arrprint(carr);
        System.out.println("\nmain arry");
        arrprint(arr);

        //
        int [] arr_m={1,3,5,7,9,2,4,6};
        System.out.println(" \nthe main array is ");
        arrprint(arr_m);
        System.out.println("\nthe copy array is ");
        int [] arr_2= Arrays.copyOf(arr_m,arr_m.length);//এই process এ array কে coopy করা হবে । template array এবং copy array এর address আলাদা হবে।
        arrprint(arr_2);
        //এখানে range ও বসানো যায়।
        int [] arr_3=Arrays.copyOf(arr_m,3);
        arrprint(arr_3);
        //range attribute use-
        int [] arr_4=Arrays.copyOfRange(arr_m,2,6);
        arrprint(arr_4);






    }

}
