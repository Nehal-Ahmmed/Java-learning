package Stacks;

import java.util.Stack;

/*
basics of stacks: basic stl
1. input in stack: push
2. get the top most element of a stack: peek
3. get and then remove top most element of a stack : pop
 */
public class a_Basics {

public static void main(String[] args){
    //implementation of a stacks: like ArrayList
Stack<Integer> st=new Stack<>();
st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.push(5);
st.push(6);

//printing
    System.out.println(st);

    //getting top most
    int x=st.peek();
    System.out.println(x);

    //remove top most
    st.pop();
    System.out.println(st);

    //size
    System.out.println("the size of the stack is: "+st.size());


}

}
