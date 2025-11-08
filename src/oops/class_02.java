package oops;
//    ACCESS MODIFIRES:
//    1.PUBLIC-EI DATAR DABBA J KONO PAKAGE USE KORA JABE
//    2.PRIVATE- EI DATAR DABBA JUST NIJER CLASS ER VITOREI KAJ KORBE .
//              i MEAN , AMI JEI CLASS FILE E NIJER CLASS BANABO, PRIVATE DATATYPE JUST OI FILE E KAJ KORBE.
//    3.DEFAULT- NORMALLY EITAI HOY. AMR TOIRI CLASS(DATATYPE) EKTA PAKAGE E KAJ KORBE. PAKAGE ER BAIRE KAJ KORBE NA.
public class class_02 {

    public static class pokemon{  //amar toiri class.
        private String name;
        public int hp;
        int attack;  //default.
    }

    public static void main(String[] args) {
        //CORRECT:-
        pokemon pikachu=new pokemon();
        pikachu.name="pikachu";
        pikachu.hp=100;
        pikachu.attack=150;

        System.out.println(pikachu.name);

         student st=new student();
         st.age=21;
        System.out.println(st.age);


        //INCORRECT:-
        // student st=new student();
        // st.name=....  karon, eita onno class file e private kora ache.

        //public ta j kono pakage e useable.



    }
}
