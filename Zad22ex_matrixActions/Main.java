import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix MxM:");
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        System.out.println(M);
        int[][] macierze1 = new int [M][M];
        int[][] macierze2 = new int [M][M];
        for(int i = 0;i <M;i++){
            for(int j = 0; j< M;j++){
                macierze1[i][j] = (int)(Math.random()*(10-0+1)+0);
                macierze2[i][j] = (int)(Math.random()*(10-0+1)+0);
            }
        }
        System.out.println("matrix 1");
        for(int i = 0;i <M;i++){
            for(int j = 0; j< M;j++){
                System.out.print(macierze1[i][j]+" ");

            }
            System.out.println("");
        }
        System.out.println("matrix 2");
        for(int i = 0;i <M;i++){
            for(int j = 0; j< M;j++){
                System.out.print(macierze2[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Sum");
        for(int i = 0;i <M;i++){
            for(int j = 0; j< M;j++){
                System.out.print(macierze1[i][j]+macierze2[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("multiplication");

        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                int ilo = 0;
                for(int k=0;k<M;k++)
                {
                    ilo +=macierze1[i][k]*macierze2[k][j];
                }
                System.out.print(ilo+" ");
            }
            System.out.println();
        }
    }
}
