package linked_list;
//creating a linked list manually.
public class question_00 {


    public static class node{
        int val;
        node next;

        public node(int val){
            this.val=val;
        }
    }


    public static void display(node head){
        question_00.node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
