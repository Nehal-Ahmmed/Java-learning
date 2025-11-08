package oops;
//it's a testing project of 'student' file or class.

import java.util.Scanner;//eita always class er baire likha hoy. 'scanner' er jaygay * dile sobkichu input newa jbe.


public class class_01 {    //ekhane 'static' use kora hoy na.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        students nehal=new students();
        nehal.name="Nehal Ahmmed";
        nehal.age=21;
        nehal.avg=94;
        nehal.clas=12;

        System.out.println(nehal.age);
        System.out.println(nehal.avg);
        System.out.println(nehal.name);
    }
}
