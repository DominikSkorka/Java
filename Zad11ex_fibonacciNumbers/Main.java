import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // F0	F1	F2	F3	F4	F5	F6	F7	F8	F9	F10	F11	F12	F13	F14	F15	F16  F17 F18  F19
        // 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597 2584 4181
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181");
        System.out.println("a program that calculates the sum of n elements of a fibonacci sequence");
        System.out.print("enter the number n of elements you want to calculate: ");
        int n = scanner.nextInt();
        int sum = 0;
        int previous = 0;
        int current = 1;
        int push;
        for(int i = 0; i < n; i++){
            push = previous + current;
            previous = current;
            current = push;
            sum += previous;
        }
        System.out.println("the sum of the first " + n + " elements is: "+ sum);
    }
}