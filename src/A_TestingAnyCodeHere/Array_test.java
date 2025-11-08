package A_TestingAnyCodeHere;

import java.util.Stack;

public class Array_test {


    public static void next_greater(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        int[] ans=new int[n];
        ans[n-1]=-1;

        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()!=0) ans[i]=st.peek();
            else ans[i]=-1;

            st.push(arr[i]);
        }

        for(int v: ans){
            System.out.print(v+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        next_greater(arr);
    }
}
