package arraylist;

import java.util.ArrayList;

//Basics of arraylist.
public class arraylist {
    public static void main(String[] args) {
        //creating the box of the array or declaring the array:
        ArrayList<Integer> l1=new ArrayList<>(); //spelling ArrayList

        //add an element serially :
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(10);
        //add using index
        l1.add(2,7);
        l1.add(4,9);

        //get an element at index i: it is not like array (ig. arr[i]).

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        //it can be printed using for loop . Or we can use a library method saved in java.util

        //print using for loop :
        for(int j=0; j<l1.size(); j++){   //here, size is a function
            System.out.print(l1.get(j)+" ");
        }
        System.out.println();

        //print directly:
        System.out.println(l1);

        //change any element:
        l1.set(5,11);
        System.out.println(l1);

        //remove any element:
        l1.remove(5);
        System.out.println(l1);

        //remove without using index:
        l1.remove(Integer.valueOf(9));
        System.out.println(l1);
        //these all are method which can return boolean:
        System.out.println(l1.remove(Integer.valueOf(8)));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1);

        //checking if an element exists:
        boolean ans=l1.contains(Integer.valueOf(7));
        System.out.println("The value 7 is presrnt in the array: "+ans);

        //if user does not specify class, user can input anything in the array:
        ArrayList l2=new ArrayList();
        l2.add("nehal");
        l2.add(1);
        l2.add(true);
        l2.add(3.5);
        l2.add('Q');
        System.out.println(l2);


    }

}
