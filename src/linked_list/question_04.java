package linked_list;
/*
question 01: find out the middle node of a given linked list
question 02: delete the middle node of a given linkedlist.
 */
public class question_04 {
    public static class node{
        int val;
        node next;

        node(int val){
            this.val=val;
        }
    }

    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static node middlenode(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }//solution for question 01.
    
    public static void deleteMiddleNode(node head){
        node slow =head;
        node fast=head;
         while(fast.next.next!=null && fast.next.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         slow.next=slow.next.next;
    }//solution for question 02.

    public static void main(String[] args){
        node a =new node(1);
        node  b=new node(2);
        node  c=new node(3);
        node d =new node(4);
        node e =new node(5);
        node  f=new node(6);
        node  g=new node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        System.out.print("the given linked list is: ");
        display(a);
//solution for question 01.
        node middleNode=middlenode(a);
        System.out.println(middleNode.val);

        //solution for question 02
        deleteMiddleNode(a);
        display(a);
        node x=middlenode(a);
        System.out.println(x.val);
        deleteMiddleNode(a);
        display(a);
    }
}
