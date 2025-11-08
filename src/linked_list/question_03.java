package linked_list;
/*
1. interlinked list: pick out the value of common node

 */
//note: the code of common node process 01 is right according to Gemini. but in intellij idea, nested while loop does not working.
public class question_03 {

    public static class node{
        int val;
        node next;

        node(int val){
            this.val=val;
        }

    }
    //question 01: common node
    //process:01 of common node->time complexity n^2
    public static node pickUpTheCommonNode(node a,node A){
        node tempi=a;
        node tempj=A;
        while(tempi!=null){
            tempj=A;
            while(tempj!=null){
                if(tempi==tempj){
                    node ans=tempi;
                     return ans;
                }
                tempj=tempj.next;
            }
            tempi=tempi.next;
        }
        return null;
    }

    //process-02 of common node-> time com=n
    public static node commonNode(node heada,node headA){
        node tempa=heada;
        node tempA=headA;
        int size_a=0;
        while(tempa!=null){
            size_a++;
            tempa=tempa.next;
        }

        int size_A=0;
        while(tempA!=null){
            size_A++;
            tempA=tempA.next;
        }

        tempa=heada;
        tempA=headA;

        int difference=0;

        if(size_a>size_A){
            difference=size_a-size_A;
            for(int i=1; i<=difference;i++){
                tempa=tempa.next;
            }
        }

        if(size_a<size_A){
            difference=size_A-size_a;
            for(int i=1; i<=difference;i++){
                tempA=tempA.next;
            }
        }

        while(tempa!=tempA){
            tempa=tempa.next;
            tempA=tempA.next;
        }

        return tempa;

    }



    public static void main(String[] args) {
        node A=new node(7);
        node B=new node(8);
        node a =new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        node f=new node(6);


        a.next=b;
        b.next=c;
        A.next=B;
        B.next=d;
        c.next=d;
        d.next=e;
        e.next=f;

        node ans=pickUpTheCommonNode(a,A);
       System.out.println(ans.val);

//        node ans=commonNode(a,A);
//        System.out.println(ans.val);
    }
}
