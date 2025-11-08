package array;
/*given Q queries , check if the given number is present in the array or not.
        querie means- Q সংখ্যক integr দেয়া থাকবে।check করতে হবে তারা array তে present  আছে কি না।
Note- value of all the elements in the aray is less than 10 to the power 5.

process-
1. frequency array নামক একটা 10^5 size এর array বানাব।
২। প্রদত্ত array টি অনুযায়ি frequency array তে store করাব 1 । প্রদত্ত array এর element হবে frequency array এর index.
3. তারপর loop দিয়ে check করাব।
 */
import java.util.Scanner;

public class array_21 {

    static int[] makefreqarray(int[] arr){
        int[] freq=new int[100005];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter an array of "+n+" size: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter Q (querie number - number of x): ");
        int q=sc.nextInt();
        int[] freq= makefreqarray(arr);
        int x= Integer.MIN_VALUE;
        while(q>0) {   //for loop দিয়ে ও করা যাবে।
            System.out.println("enter the value of x (which integer I want to search) :");
            x=sc.nextInt();
            if (freq[x] > 0) System.out.println(x + " is present");
            else System.out.println(x + " is not present");
            q--;
        }
    }

}
