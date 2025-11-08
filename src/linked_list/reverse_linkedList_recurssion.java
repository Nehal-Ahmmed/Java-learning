package linked_list;

public class reverse_linkedList_recurssion {

    public static class node{
        int val;
        node next;

        node(int val){
            this.val=val;
        }
    }

    public static class LinkedList{
        node head=null;
        node tail=null;

        void add(int val){

            node newnode=new node(val);

            if (head==null){
                head=newnode;
            }
            else tail.next=newnode;

            tail=newnode;
        }

        void display(){
            node temp=head;

            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static node rec(node head){
        if(head.next==null) return head;
        node newHead=rec(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.display();
       node head= rec(ll.head);
        ll.display();
    }
}
