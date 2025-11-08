package if_else;
import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your persentage: ");
        int n=sc.nextInt();
        if(n<0 || n>100) System.out.println("your input is not valid. Please recheck your mark. It should be in the range from 0 to 100.");
        else if(100>=n && n>=80) System.out.println("your grade is : A+");
        else if(n>=70) System.out.println("your grade is : A");
        else if(n>=60) System.out.println("your grade is : A-");
        else if(n>=50) System.out.println("your grade is : B");
        else if(n>=40) System.out.println("your grade is : C");
        else if(n>=33) System.out.println("your grade is : D");
        else if(n>=0) System.out.println("your grade is : F");


    }
}
