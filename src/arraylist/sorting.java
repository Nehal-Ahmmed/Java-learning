package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList();
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(4);
        l1.add(1);
        System.out.println(l1);

        //sorting using Collections library.
        Collections.sort(l1);
        System.out.println("sorted in ascending order: "+l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("descending order: "+l1);

        ArrayList<String> l2=new ArrayList<>();
        l2.add("welcome");
        l2.add("to");
        l2.add("physics");
        l2.add("wallah");
        System.out.println("original array: "+l2);
        Collections.sort(l2);
        System.out.println("sorted: "+l2);
    }
}
