package functions;

//sum of array.

public class fn_01 {
    void sumofarray(){
        int [] arr={1,2,3,4,9};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        fn_01 obj=new fn_01();
        obj.sumofarray();
    }
}


