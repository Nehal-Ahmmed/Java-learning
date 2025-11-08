package array;
import java.util.Scanner;
//search a number x in an array. If it is found print the index number else print -1 or print 'not found'.
public class array_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 2, 5, 7, 4, 6, 8, 12, 33, 45, 54, 56};
        int ans = -1;
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                ans = i;
            break;}
        }
        if(ans==-1)
            System.out.println("Not found");
        else System.out.println("the number " + x + " is in " + ans + " th index");


    }
}
