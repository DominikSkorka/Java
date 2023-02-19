import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[20];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100) + 1;
        }
        System.out.println("20 random array elements: ");
        for (int number : tab) {
            System.out.print(number + " ");
        }
//-----------------------------------------------------------------------
        System.out.println("\n");
        System.out.println("20 sorted ascending random array elements: ");
        Arrays.sort(tab);
        for (int number : tab) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
        System.out.println("20 sorted descending random array elements: ");
        Arrays.sort(tab);
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
//-----------------------------------------------------------------------
        System.out.println("\n");
        int sum = 0;
        for (int number : tab) {
            sum += number;
        }
        double average = (double)sum / tab.length;
        System.out.println("Average value of array elements: " + average);
//-----------------------------------------------------------------------------
        System.out.println("\n");
        int Odd = 0;
        for (int number : tab) {
            if (number % 2 != 0) {
                Odd++;
                System.out.print(number + " ");
            }
        }
        System.out.println("\nOdd number in array: " + Odd);
//-----------------------------------------------------------------------------
        System.out.println("\n");
        int even = 0;
        for (int number : tab) {
            if (number % 2 != 1) {
                even++;
                System.out.print(number + " ");
            }
        }
        System.out.println("\nnumber of even numbers in the array: " + even);

    }
}
