package linked_list;
//creating linked list
public class basics {

    public static class node{
        int data;
        node next;

        //creating constructor
        node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(9);
        node c=new node(1);
        node d=new node(6);
        node e=new node(3);
        node f=new node(7);
        node g=new node(0);
        node h=new node(5);

        //3 9 1 6 3 7 0 5

        //how to set the link:
        a.next=b;  //3->9 1 6 3 7 0 5 -->অর্থাৎ, a object (or node) এর 'next' attribute বা দ্বিতীয় ঘরে b এর address store হইছে।
        // তাহলে, a.next মানেই হলো b.     a.next.data=9.
        b.next=c;  //3->9->1 6 3 7 0 5
        c.next=d;  //3->9->1->6 3 7 0 5
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        //how to print smartly:

        node temp=a; // এখানে নতুন কোনো নোড তৈরি করি নাই। temporary node তৈরি করে তাতে a node or a node's adress কে store করছিই।
        while (temp!=null){ //শেষেরটার এড্রেস ঘর এ নাল থাকবে যা টেম্প এ স্টোর হবে। g.next চেক করলে নাল পাবে।
            System.out.print(temp.data+" ");
            temp=temp.next; //storing b in the temp.
        }

        int x=5;
        int y=3;
        while(x>0){
            while(y>0){
                System.out.print('a');
                y--;
            }
            x--;
            System.out.println();
        }

    }

}
