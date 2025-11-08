package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class test {
    public static int[] nextLargerElement(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int i=n-2;
        st.push(arr[n-1]);
        int[] ans=new int[n];


ans[n-1]=-1;
        while(i>=0){
            while(st.size()>0 && arr[i]>st.peek()) st.pop();
            if(st.size()!=0) ans[i]=st.peek();
            else ans[i]=-1;
            st.push(arr[i]);
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,4};
int[] ans=nextLargerElement(arr);
       for(int val: ans){
           System.out.print(val+" ");
       }
    }
}
