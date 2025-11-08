package Strings;
import java.util.*;
public class s8_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //using loop
        String str=sc.nextLine();
        boolean flag=true; //true->palindrome;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
