package Strings;
//if the given string is aaaabbbccd, then the output should be a4b3c2d.
public class s10_string {
    public static void main(String[] args) {
        String str="aaaaabbbbcdde";
        int count=1;
        char ch=' ';
        char prev_ch=' ';
        String ans="";
        for(int i=1; i<str.length();i++){
            ch=str.charAt(i);
            prev_ch=str.charAt(i-1);
            if(ch==prev_ch){
                count++;
            }
            else{
                ans+=prev_ch;
                if(count!=1) ans+=count;
                count=1;
            }
        }
        ans+=ch;
        if(count!=1) ans+=count;
        System.out.println(ans);
    }
}
