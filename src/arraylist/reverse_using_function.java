package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_using_function {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add('A');
        l.add(1);
        l.add("nehal");

        System.out.println(l);

        Collections.reverse(l);  //method's name is dot reverse saved in the library of .util
        System.out.println(l);
    }

}
