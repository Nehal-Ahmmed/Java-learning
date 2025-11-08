package Strings;
//toggle করা মানে string এর capital letter কে small করা আর small letter কে capital করা।
import java.util.*;

public class s6_toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
    StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println("The string is : "+str);

        for(int i=0; i<str.length();i++){
            int ascii=(int)str.charAt(i);
            if(ascii<97){
            ascii+=32;
            }
            else{
                ascii-=32;
            }
            char ch=(char)ascii;
            str.setCharAt(i,ch);
        }

        System.out.println("The toogled string is : "+str);



    }
}
