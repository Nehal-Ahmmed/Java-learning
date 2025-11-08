package javainputs;
import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radus:");
        int radius;
        radius=sc.nextInt();
        double pi=3.1416;
        double area=pi*radius*radius;
        System.out.println("The area is : "+area+" square unit.");
    }
}
