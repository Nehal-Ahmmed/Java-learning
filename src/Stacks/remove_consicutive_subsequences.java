package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class remove_consicutive_subsequences {

    public static int[] remove(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if (st.peek()==arr[i]){
                if (i==n-1||arr[i]!=arr[i+1]) st.pop();
            }
        }

        int N=st.size();
        int[] ans=new int[N];

        for(int i=N-1; i>=0; i--){
            ans[i]=st.pop();
        }
    return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,2,6,4,8,9,9,9,9,1,8};

        int[] answer=remove(arr);

        for(int val: answer){
            System.out.print(val+" ");
        }
    }
}
