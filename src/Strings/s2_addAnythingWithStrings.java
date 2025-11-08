package Strings;
//this program is for adding integer/character/strings wiht a given strings
import java.util.*;
public class s2_addAnythingWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="neh";
        str=str+"al";
        System.out.println(str);
        str+="Ahmmed";
        System.out.println(str);

        String str2="neh";
        str2=str2+"al"+'A'+"hmmed"+10;
        System.out.println(str2);
        //here, integer or character converted into strings.

        //if I write:
        System.out.println("abc"+'r');
        System.out.println("abc"+10);
        System.out.println("abc"+10+20);//output: abc1020 not abc30
        //cz, the operation order is left to right . firstly, 10 will
        //convert into string then 20 will also. so, abc1020 is a full string.

    }
}
