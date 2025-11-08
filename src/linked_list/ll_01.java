package linked_list;
//making linked list like array list and meke it easier.
public class ll_01 {

    //making nodes
    public static class node{
        int data;
        node next;

        //creating constructor.
        node(int data){
            this.data=data;
        }
    }

    //creating a class for making linked list.
    public static class linkedlist{
        node head=null;
        node tail=null;

        void add(int val){ //it will insert at end
            node temp=new node(val);

            //initializing the list
            if(head==null){
                head=temp;
            }

            else{
                tail.next=temp;
            }

            tail=temp; //এর মানে হলো temp নামক node টার নাম আমি tail রাখলাম।
        }

        void add_head(int val){    //it will insert at head
            node temp=new node(val);

            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void addindexat(int index,int val){

            if(index==size()){
                add(val);
                return;
            }

            else if(index==0){
                add_head(val);
                return;
            }

            else if(index<0 || index>size()){
                System.out.println("wrong index");
                return;
            }

            node newnode=new node(val);
            node temp=head;
            for(int i=0; i<index-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }

        void getIndex(int index){ //printing an element of a given index.
            node temp=head;
            for(int i=1; i<= index;i++){
                temp=temp.next;
            }
            System.out.println("the element is : "+temp.data);
        }

        void deleteAt(int index){
            if(index==0){
                head=head.next;
                return;
            }

            node temp=head;
            int i=1;
            while (i<index){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            if(temp.next==null) { //or, (index==size()-1)
                tail=temp;
            }
        }

        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){ //প্রত্যেক অপারেশনের পরে size কে plus বা minus করেও size নির্ণয় করা যায়। এতে time & space complexity ও ভালো হয় program এর।
            int count=0;

            node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }

            System.out.println("the size of the list is: "+count);
            return count;
        }

    }

    public static void main(String[] args) {
        //ami basics er moto input nite cai na.
        linkedlist ll=new linkedlist();

        ll.add_head(1);
        ll.add(4);
        ll.add(6);
        ll.add(2);
        ll.add(7);
        ll.add(0);
        ll.add(1);
        ll.add(5);
        System.out.print("The linked list is: ");
        ll.display();
        System.out.println("add a new element at any index: ");
        ll.addindexat(4,9);
        ll.display();
        System.out.println("The length of the linked list is: "+ll.size());

        ll.addindexat(0,0);
        ll.display();
        ll.addindexat(10,0);
        ll.display();
        ll.addindexat(12,0);
        ll.addindexat(-1,0);
        ll.getIndex(3);
        System.out.println(ll.tail.data);
        ll.size();
        ll.deleteAt(10);
        ll.display();
        System.out.println(ll.tail.data);
        ll.deleteAt(0);
        ll.display();
    }

}
