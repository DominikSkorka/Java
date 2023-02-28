package Package;

public class Human { //static, that is, one for the whole class, not one object

    Human(String name){
        this.name = name;
         members++;
    }
    String name;
    static int  members = 0;
}
