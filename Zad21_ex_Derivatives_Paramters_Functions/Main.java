import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] polynomial = new int[3][2];
        for(int i = 0; i <3;i++) {
            System.out.println("Enter N");
            polynomial[i][0] = s.nextInt();
            System.out.println("Enter A");
            polynomial[i][1] = s.nextInt();
        }
        System.out.println("Enter X");
        int x = s.nextInt();

        System.out.print("Enter the program number ");
        System.out.println("\n1 - set value");
        System.out.println("2 - determine the derivatives");
        System.out.println("3 - printing the parameter");
        System.out.println("4 - printing out the value");
        int numer = s.nextInt();
        System.out.println("");

        switch (numer){
            case 1:
                for (int i = 0;i < 3;i++){
                    setValue(x,polynomial[i][1],polynomial[i][0]);
                }
                break;
            case 2:
                for (int i = 0;i < 3;i++){
                    printDerivative(x,polynomial[i][1],polynomial[i][0]);
                }
                break;
            case 3:
                for (int i = 0;i < 3;i++){
                    printParameters(polynomial[i][1]);
                }
                break;
            case 4:
                for (int i = 0;i < 3;i++){
                    printValue(polynomial[i][0]);
                }
                break;
            default:
                break;
        }
    }

    public static void setValue(int x, int a, int n) {
        float y = 0;
        for(int i = 0;i < 3;i++) {
            for (int j = 0; j < n; ++j) {
                y += a * Math.pow(x, (double) (n - (i + 1)));
            }
        }
        System.out.println(y);
    }
    public static void printDerivative(int x, int a,int n ) {

        double[] v = new double[n - 1];

        for(int i = 0; i < n - 1; ++i) {
            v[i] = a * (double)(n - (i + 1));
            System.out.println(v[i]);
        }

    }
    public static void printParameters( int a) {
        System.out.print(" " + a + ",");
    }
    public static void printValue( int n) {
        System.out.print(" " + n + ",");
    }
}