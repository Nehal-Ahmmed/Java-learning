package Stacks;

import java.util.Stack;

//reverse a stack using extra space
public class reversingAstack {
    public static void main(String[] strings){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        System.out.println("the given stack is: "+st);
        System.out.println("size "+st.size());

        /*process 01
        Stack<Integer> newStack=new Stack<>();

        while(st.size()>0) {

            int x = st.pop();
            newStack.push(x);
        }

        System.out.println("the reversed stack is: "+ newStack);

         */

        //process 2
        Stack<Integer> newSt=new Stack<>();

        while(st.size()>0)
        newSt.push(st.pop());

        System.out.println("reversed stack is: "+newSt);



    }

}
