package linked_list;

import static linked_list.question_00.*; //এর মানে হলো , আমি অই ক্লাসের সবকিছুর access পাব।


//delete a node . here head node is not given .
//delete nth term from the last.
public class question_01 {


    public static void main(String[] args){

        node a =new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        node f=new node(6);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

            display(a);
//নোড ডিলিট করাঃ
        //deleting a node: suppose, in the question , only c is given ,nothing else
        //so , I have to delete c node
        c.val=c.next.val;
        c.next=c.next.next;

       display(a);

       //deleting nth node from the end by 2 traversal using formula. here n=2. node head is given.
        /*
        the node, from the last = from the starting
                  2  nd           =( total size - n +1 ) th
         */
       int n=2;
       int size=0;
       node temp=a;
       while(temp!=null){
           size++;
           temp=temp.next;
       }
       n=size-n+1;
       node tem=a;
       for(int i=1; i<n-1; i++){
           tem=tem.next;
       }
       tem.next=tem.next.next;
       display(a);



    }
}
