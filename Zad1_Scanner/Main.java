import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        int age;

        System.out.println("what's your name?");
        name = scanner.nextLine();
        System.out.println("what's your suname?");
        surname = scanner.nextLine();

        System.out.println("what's your age?");
        age = scanner.nextInt();

        System.out.printf("Hello "+ name + " %s ", surname + " age: "+ age);
    }
}