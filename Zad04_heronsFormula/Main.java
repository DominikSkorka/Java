import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;

        System.out.println("Area of a triangle from Heron's formula with sides a b c");
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();

        double f,field;

        f = (a + b + c) / 2;
        field =Math.sqrt(f*(f-a)*(f-b)*(f-c));
        System.out.println("field = " + field);
    }
}