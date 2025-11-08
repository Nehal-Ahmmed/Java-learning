package linked_list;
//delete nth node from the last
import static linked_list.question_00.*;
public class question_02_update {
    public static node deletenth(node head,int n){
        node fast=head;
        node slow=head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
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
        a=deletenth(a,6);
        display(a);
    }
}
