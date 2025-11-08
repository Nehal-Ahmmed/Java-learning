package oops;

public class functioncall {
    public static class student{ //alada class create korar maddhome student namok datatype banalam.
        //etake main function er baire ar name class er vitore likhte hoy.
        String name;
        String fathersname;
        int age ;
    }

    public static void call(student x){ //alada void type function.
        System.out.println("Name: "+x.name);
        System.out.println("Fathers name: "+x.fathersname );
        System.out.println("Age :"+x.age);
        return;
    }

    public static void main(String[] args) {
        student st1=new student();//nijer toiri kora class (dabba) e data entry korar jonno emne likhte hoy.
        st1.name="Nehal Ahmmed";//nijer toiri datatype emnei likhte hoy.
        st1.fathersname="Shahidul Islam";
        st1.age=21;

        student st2=new student();
        st2.name="Mehedi Hasan";
        st2.fathersname="Shahidul Islam";
        st2.age=22;

        call(st1);//pass by reference hobe.
        call(st2);//kintu 'int' type data hole pass by value hoilon. shudhu value ta pathay dewa hoito function e.
    }

}
