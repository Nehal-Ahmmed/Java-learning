package Strings;
//importing :taking all inputs
import java.util.*;
public class s1_basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //***how to declare and take input:

          String str="Nehal Ahmmed";
//        System.out.println(str);
//
        //****taking input from user :

//        String a=sc.next();
//        System.out.println(a);
//
//        String b=sc.nextLine();
//        System.out.println(b);

        //***use of function: length():

//        System.out.println(str.length());   //it is as like arr.length
//
//        //***use of function: charAt()-->it will return the character of an index stated in the function.
//
//        System.out.println(str.charAt(8));
//
//        //***use of function: indexOf--> it will return the index a of given character.
//        System.out.println(str.indexOf('m'));

        //***use of function: compareTo()
        /*
        it can return 3 values: negative or 0 or positive integer.যদি দুইটা string same হয়
        তাহলে return করবে= ০। আর আলাদা হলে , প্রথম যে দুইটা letter আলাদা তাদের মাঝে subtraction করবে ও
        তা return করবে।
         */
//        String x="nehal";
//        String y="nehal";
//        System.out.println(x.compareTo(y)); //output: 0
//
//        String p="mehedi";
//        System.out.println(p.compareTo(x)); //output: -1
//
//        String q="nehbl";
//        System.out.println(q.compareTo(x)); //output: 1

//        //***use of function: contains("")---> it will return a boolean .
//        System.out.println(str.contains("hal"));
//        System.out.println(str.contains("n"));
//        //***more:
//        System.out.println(str.startsWith("Neha"));
//        System.out.println(str.endsWith("mmed"));

//        //***use of function: toUpperCase() & toLowerCase & concat:
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());

//        String s1="nehal";
//        String s2="ahmmed";
//        System.out.println(s1.concat(s2)); //concat function add to strings.

        //**use of function: equals() -> এটা দুইটা string এর প্রত্যেক্টা character তুলনা করে।
        //কিন্তু == operator use করা হলে, তা string দুইটার address কে তুলনা করবে।
        String a="nehal";
        String b="nehal";
        String c=new String("nehal");
        System.out.println(a==b); //it will return true.
        System.out.println(a==c);  //it will return false.

        System.out.println(a.equals(c)); //it will return true.
    }
}
