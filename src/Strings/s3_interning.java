package Strings;

public class s3_interning {
    public static void main(String[] args) {
        /*interning: একটি string লেখা হলে, তা প্রথমে হিপ মেমোরি তে স্টোর হয়।
        তারপর , স্টক মেমোরিতে ডাব্বা তৈরি করে স্টোর হয়। তারপর আরেকটা string লেখা হলে
        হিপ মেমোরিতে থাকা অবস্থায় চেক হয় যে এইরকম কোনো string আগে তৈরি করা হয়েছিল কি না।
        হয়ে থাকলে , আগেরটার address এ একই মেমোরি ল্লোকেশন এ পাঠানো হয়।
        তখন একটা লেখাকে বা string কে দুইটা ডাব্বা denote করে। অর্থাৎ একটা আব্বার
        দুইটা নাম। এতে মেমোরির জায়গা save হয়। --> এই process টা কে বলে interning.
        array তেও এমটা হয়।কিন্ত pass by reference হওয়ায় , একটা ডাব্বাতে change আনলে
        অপরটায় ও change হয়ে যায় । কিন্তু string pass by reference না হওয়ায় এওম্নটা হয় না।

        এই interning কে এড়ানো যায় new keyword দিয়ে।

         */

        String str="nehal";
        String gtr="nehal";
        System.out.println(gtr);
        System.out.println(str);

        String a=new String("nehal");
        System.out.println(a);

        /*
        immutability of java string:
        string is basically character array. But there are some differences.
        array তে কোণো individual character কে change করা যায়। কিন্তু string এ তা করা যায় না।
        এটাই immutability of strings of java.
        অর্থাৎ java তে একবার একটি ঠিকানাতে কোণো একটি sting store করানো হলে ঐ ঠিকানার string এ
        আর কোনো change আনা possible না। নতুন string তৈরি করা যাবে। অথবা পুর্বের ডাব্বায় নতুন string
        add করানো যাবে। আর আগের string টা gurযাবে।
         */

    }
}
