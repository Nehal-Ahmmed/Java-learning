package Stacks;

import java.util.*;
//normally
public class insertAtAnyIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(11);
        st.push(12);

        System.out.println(st);

        System.out.println("Number:");
        int num=sc.nextInt();

        System.out.println("index: ");
        int idx=sc.nextInt();

        int n=st.size();

        Stack<Integer> nt=new Stack<>();


        int i=0;
        while(i<n-idx){
            nt.push(st.pop());
            i++;
        }
        st.push(num);

        while(nt.size()>0){

            st.push(nt.pop());
        }

        System.out.println(st);
    }
}
