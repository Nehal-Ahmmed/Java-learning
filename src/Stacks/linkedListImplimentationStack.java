package Stacks;

public class linkedListImplimentationStack {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        void displayrec(Node h){ //it should be done using recursion
           if(h==null) return;
           displayrec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        void size(){
            System.out.println("the size of the stack is: "+size);
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is emply.");
            }
            int a=head.val;
            head=head.next;
            return a;
        }

        void peek(){
            if(head==null) System.out.println("stack is empty");
            System.out.println("peek element is :"+head.val);
        }

    }

    public static void main(String[] args){
        LLStack st=new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        st.display();
        st.size();
        st.pop();
        st.display();
        st.peek();
    }
}
