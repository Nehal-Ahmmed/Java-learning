package linked_list;
//delete nth term from the last using one traversal (fast & slow node )
import static linked_list.question_00.*;
public class question_02_fast_slow {

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
//slow fast process:
        int n=2;

        node fast=a;
        node slow=a;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
//
        display(a);

    }

}
