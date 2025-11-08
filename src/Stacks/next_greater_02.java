package Stacks;

import java.util.Stack;

public class next_greater_02 {

    public static int[] next_greater_2(int[] arr){

        Stack<Integer> st=new Stack<>();
        st.push(0);
        int n=arr.length;
        int[] ans=new int[n];

        for(int i=1;i<n; i++){

            while( st.size()>0 && arr[st.peek()]<arr[i]){
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }

        for(int j=0; j<n; j++){
            if(ans[j]==0) ans[j]=-1; 
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int[] ans=next_greater_2(arr);
        for (int val: ans){
            System.out.print(val+" ");
        }
    }
}
