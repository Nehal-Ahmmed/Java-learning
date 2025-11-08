package Strings;
//uses of substrings

public class s4_substring {
    public static void main(String[] args) {
        String str="NehalAhmmed";
        System.out.println(str.substring(0,4));  //it will print from the index of 0 to 3.
        System.out.println(str.substring(4));

        //let a string str= abcd. The substring of the whole string is :
        //a ab abc abcd b bc bcd c cd d
        //how to print all the substrings of the string:
        String str2="abcd";
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(str2.substring(i,j)+" ");
            }
        }


    }
}
