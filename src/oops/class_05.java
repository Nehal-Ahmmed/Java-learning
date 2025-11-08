package oops;
/*
    use of keywords in oops inclusing final keyword, static keyword , this keyword.
    static keyword কে oops এ class তৈরির সময় datatype এর আগে use করা যায়। যদি constructor এ কোনো attribute declare করার সময় তার আগে static keyword use
    করা হয়(ig. static int number;) তাহলে সকল objects এর জন্য ঐ attribute এর একটী common ডাব্বা তৈরি হবে।
    আর increment কে constructor এ use করা হয়।(ig. number++;)
 */
public class class_05 {

    public static class students{
        static int numberofstudent;
        String name;
        final String schoolname="MMHS"; //not changeable while creating object.
        int age;
        float percentage;


        //creating constructor
        public students(String name,int ag,float percentage){
            numberofstudent++;    //increment in constructor
            this.name=name;     //this keyword.
            age=ag;
            this.percentage=percentage;
        }
    }

    public static void print(students x){
        System.out.print(x.numberofstudent+". ");
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.percentage);
        System.out.println(x.schoolname);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        students s1=new students("Nehal Ahmmed",21,93);
        print(s1);
       // System.out.println(s1.numberofstudent);
        students s2=new students("Arman", 21,81);
        print(s2);
        // System.out.println(s2.numberofstudent);
        students s3=new students("asif",21,80);
     //   System.out.println(s3.numberofstudent);
        print(s3);


    }

}
