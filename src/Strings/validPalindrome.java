package Strings;

public class validPalindrome {

    public static boolean ignoreNonAlphaNumeric(String str) {

        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int n = str.length();
        int i = 0, j = n - 1;

        while (i <= j) {


            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if (c1 == c2) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


        public static void main (String[]args){

            String str = "ne@_hal";
            System.out.println(ignoreNonAlphaNumeric(str));

        }

    }
