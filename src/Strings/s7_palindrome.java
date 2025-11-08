package Strings;
//abcdcba it is a palindrome .
public class s7_palindrome {
    public static void main(String[] args) {
        //using stringbuilder
        String gtr="abcdcba";
        StringBuilder str=new StringBuilder(gtr);
        String ptr=str.reverse()+"";
        if(ptr.equals(gtr)){
            System.out.println("palindrome");
        }
        else System.out.println("not palindrome");
    }
}
