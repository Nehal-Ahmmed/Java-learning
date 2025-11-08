package arraylist;

import java.util.ArrayList;

public class reverse_array {

    static void reverse_array(ArrayList<Integer> arr){
        int i=0;
        int j=arr.size()-1;
        while(i<j){

            /*
            int temp=a;
            a=b;
            b=temp;
             */

            Integer temp=Integer.valueOf(arr.get(i));
            arr.set(i,arr.get(j));
            arr.set(j,temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
        reverse_array(arr);
        System.out.println(arr);
    }
}
