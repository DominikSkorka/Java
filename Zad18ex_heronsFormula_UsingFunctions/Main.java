import java.util.Scanner;

public class Main {
    public static double HeronsField(double a, double b, double c){
        double field, f;
        f = (a + b + c) / 2;
        field = Math.sqrt(f*(f-a)*(f-b)*(f-c));
        return field;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of a triangle from Heron's formula with sides a b c");

        double a, b, c;
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();
            System.out.println(HeronsField(a, b, c));
    }
}