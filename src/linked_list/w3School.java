package linked_list;

import java.util.LinkedList;

//linked list library object & how to print a linked list shortly
public class w3School {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        //print the linkedlist: using for each loop
        ll.forEach(
                (n)->{
            System.out.print(n+" ");
        }
        );

        System.out.println();
        //print the size.
        System.out.printf( "the size of the linked list is:%d",ll.size());
    }
}
