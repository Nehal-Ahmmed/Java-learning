package linked_list;

import jdk.dynalink.linker.LinkerServices;

//question
/*
 ধরি, প্রশ্নকর্তা একটি লিংকড লিস্ট বানায় রাখছে। যার সাইজ , এলিমেন্ট কিছুই দেয় নাই। শুধু প্রথম বা হেড এলিমেন্ট দেয়া আছে  প্রশ্নে।
 এবার, তিনি লিস্টের শেষে একটি এলিমেন্ট এড করতে বললেন। How to solve the  problem?
 */
public class ll_02 {

    public static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
        }
    }

    public static void display(node head){  //print through normal process
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void displayR(node head){
        if(head==null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        displayR(head.next);
    }


    static void insertAtEnd(node a,int n){
        node newnode=new node(n);
        node temp=a;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public static void main(String[] args) {
        node a=new node(3);  //head element
        node b=new node(5);
        node c=new node(3);
        node d=new node(7);
        node e=new node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //প্রশ্নকর্তার লিস্ট যা দেয়া নাই, জাস্ট হেড এলিমেন্ট দেয়া আছে।

        //solve:
        int n=5; //n=need to be added.
        insertAtEnd(a,5);
        display(a);
        displayR(a);

    }

}
