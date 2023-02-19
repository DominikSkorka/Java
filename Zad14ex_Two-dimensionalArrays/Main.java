import java.util.Random;
import java.util.Scanner;

public class Main {
    // In a two-dimensional array, find the row and column number with the largest, sum of elements
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many rows do you want?");
        int rows = scanner.nextInt();
        System.out.println("how many columns do you want?");
        int columns = scanner.nextInt();
        int [][] tab = new int[rows][columns];
        int sum, i, j;
        Random rand = new Random();
        for(i = 0; i <rows; i++){
            for(j = 0 ; j < columns; j++){
                tab[i][j] = rand.nextInt(100);
            }
        }
//--------------------------------------------------------------writing numbers
        for ( i = 0; i < rows; i++) {
            for ( j = 0; j < columns; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
//---------------------------------------------------------------
        int maxrow = 0;
        int maxrowindeks = 0;
        for (i = 0; i < rows; i++) {
            sum = 0;
            for (j = 0; j < columns; j++) {
                sum += tab[i][j];
            }
            System.out.println("the sum of row " + i + " is: " + sum);
            if (sum > maxrow) {
                maxrow = sum;
                maxrowindeks = i;
            }
        }
        System.out.println("Row " + maxrowindeks + " has the largest number which is: " + maxrow+"\n");
//----------------------------------------------------------------
        int maxcollumn = 0;
        int maxcollumnindeks = 0;
        for (i = 0; i < columns; i++) {
            sum = 0;
            for (j = 0; j < rows; j++) {
                sum += tab[j][i];
            }
            System.out.println("the sum of collumn " + i + " is: " + sum);
            if (sum > maxcollumn) {
                maxcollumn = sum;
                maxcollumnindeks = i;
            }
        }
        System.out.println("Collumn " + maxcollumnindeks + " has the largest number which is: " + maxcollumn);
    }

}