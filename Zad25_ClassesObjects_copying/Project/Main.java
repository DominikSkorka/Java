package Project;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int number = 50;
        System.out.println("number before: "+number);
        change(number);
        System.out.println("number after: "+number);

        Number objectNumber = new Number();
        objectNumber.number = 50;
        System.out.println("object number before: "+objectNumber.number);
        change(objectNumber);
        System.out.println("object number after: "+objectNumber.number);
    }
    public static void change(int number){
        number = -1;
    }
    public static void change(Number objectNumber){
        objectNumber.number = -1;
    }
}