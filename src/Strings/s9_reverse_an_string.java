package Strings;

public class s9_reverse_an_string {
    public static void main(String[] args) {
        String str=new String("my name is nehal ahmmed bhuiyan");
        StringBuilder sb=new StringBuilder();
        char ch=' ';
        String ans="";
        for(int i=0; i<str.length();i++){
            ch=str.charAt(i);
            if(ch!=' '){
            sb.append(ch);
            }
            else{
                sb.reverse();
                sb.append(' ');
                ans+=sb;
                sb=new StringBuilder();
            }
        }
        sb.reverse();
        System.out.println(ans+sb);
    }
}
