package linked_list;

import java.util.Scanner;

public class practise {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        node head=null;
        node tail=null;

        void insertAtEnd(int val){
            node temp=new node(val);

            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }

        int size(){
            node temp=head;
            int size=0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }


        void disply(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");

                temp=temp.next;
            }
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linkedlist ll=new linkedlist();
        System.out.println("Enter the size of the linked list: ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            ll.insertAtEnd(sc.nextInt());
        }

        ll.disply();
    }
}
