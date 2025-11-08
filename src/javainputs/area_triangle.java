package javainputs;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class area_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the sides:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int s=(a+b+c)/2;
        int area = (int) sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: "+area);


    }
}
