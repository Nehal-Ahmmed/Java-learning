package oops;
//using constructors- objects কে সংক্ষিপ্ত ভাবে উপস্থাপন করা।
//use of 'final' keyword
public class class_04 {

    public static class student{
        String name;
        int rno;
        double avg;
        final String schoolname="MMHS";    //এইটা changeable না। এই attribute যে কোনো object এ same থাকবে।

        //constructing another func
        public student(String nam,int roll,double average){//কিন্তু 'String nam' এর জায়গায় 'String name' use করার জন্য-
            name=nam;//name এর আগে "this." keyword use করতে হবে।
            rno=roll;
            avg=average;
        }
    }

    public static void print(student x){  //printing function
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.avg);
    }

    public static void main(String[] args) {
    student s1=new student("Nehal Ahmmed",01,94.3);
    print(s1);
    student s2=new student("mehedi hasan",01,96.8);
    print(s2);
        student s3=new student("amir hasan",02,80.8);
        print(s3);
        student s4=new student("hasan",10,76.8);
        print(s4);
    }


}
