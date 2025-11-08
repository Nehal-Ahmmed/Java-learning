package Strings;
//it is as like arraylist
//এটাতে interning বা immutability কাজ করে না
//এটাতে directly change আনা যায়। বারবার নতুন string তৈরি হয়না।
public class s5_string_builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello"/*type size, or keep it empty, it will take size 16 default*/);
        System.out.println(str);

        //**use of functions: setCharAt() ->it can directly change the string
        str.setCharAt(0,'d');
        System.out.println(str); //str এ directly change হচ্ছে।

        //**use of functions: append() -> it is to add new string or int or float etc at the end of the old
        str.append(" nehal");
        System.out.println(str);

        //**use of functions:insert()
        str.insert(0,'w');
        System.out.println(str);

        //**use of functions:deleteAt()
        str.deleteCharAt(1);
        System.out.println(str);

        //**use of functions:reverse()
        str.reverse();
        System.out.println(str);

    }
}
