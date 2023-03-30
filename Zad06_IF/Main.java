import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("How old are you?");
        age = scanner.nextInt();

       if(age >= 18) {
           System.out.println("You are an adult!");
       } else {
           if (age >= 16){
               System.out.println("you can work");
               System.out.println("but");
           }
           System.out.println("You are not an adult");
       }

       //--------------------------------true----------------------false-----------------
       String name = age >= 18 ? "\nDominik is an adult" : "\nDominik is not an adult and cannot work";
        System.out.println(name);
    }
}