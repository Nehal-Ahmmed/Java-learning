package array;
/*
arr={1,2,3}
number of subarrays= n*(n+1)/2 =6

subarrays=
1
1 2
1 2 3
2
2 3
3
অর্থাত j, k দিয়ে একটি ত্রিভুজ তৈরি করব
তারপর প্রত্যেকটা সংখ্যার জন্য একটি করে ত্রিভুজ করে দিব
 */
public class subarrays {

    static void subarr1(int[] arr,int n){
        int numOfsub=n*(n+1)/2;
        System.out.println("number of subarrays: "+numOfsub);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }


    public static void main(String[] args) {


        int[] arr = {1, 4, 5, 2, 8};
        int n = arr.length;

        //printing subarrays trigonally:
        subarr1(arr,n);

    }

}
