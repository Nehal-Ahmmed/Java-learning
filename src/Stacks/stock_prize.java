package Stacks;

import java.util.Stack;

public class stock_prize {


 public static void highest_stock_number(int[] arr){

     Stack<Integer> st=new Stack<>();
     int n=arr.length;
     int[] ans=new int[n];
     ans[0]=1;
     int i=0;
     st.push(i);

     for(i=1; i<n; i++){
         while(arr[st.peek()]<arr[i] && st.size()>0){
             st.pop();
         }
         int span=i-st.peek();
         ans[i]=span;
         st.push(i);
     }

     for(int j=0; j<n; j++){
         System.out.print(ans[j]+" ");
     }
     
 }


    public static void main(String[] args){

     int[] arr={100,80,60,70,60,75,85};
     highest_stock_number(arr);


//          Scanner sc=new Scanner(System.in);
//     int[] arr=new int[6];
//     int i=0;
//     while(i<6){
//         arr[i]=sc.nextInt();
//         i++;
//     }


//
//        Stack<> st=new Stack();
//
//        System.out.println("Enter the size of the stacck: ");
//        int n= scanner.nextInt();
//        for(int i=0; i<n; i++){
//            st.push(scanner.nextInt());
//        }
//
//       while(st.size()!=0){
//            System.out.print(st.pop()+" ");
//        }

    }
}
