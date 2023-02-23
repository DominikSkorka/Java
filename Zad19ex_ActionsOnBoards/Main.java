import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10,13,19,18,14,16,17,9,3,-5,8,-7,-12};
        int avarage = 0;

        System.out.println("Normal and reverse order of adding elements: ");
        for(int i = 0; i < numbers.length;i++){
            avarage += numbers[i];
            System.out.print(numbers[i]+" ");
        }
        avarage /= numbers.length;
        System.out.println("");
        for(int i = numbers.length-1; i>0;i--){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\nEven numbers");
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i]%2==0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\nOdd numbers");
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i]%2!=0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\nHow many elements are greater than the average value of these elements:");
        System.out.println(avarage);
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i]> avarage){
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\nConverting negative values to their squares: ");
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i]< 0){
                System.out.print(Math.pow(numbers[i],2)+" ");
            }
        }


        System.out.println("\nDisplay data for points that are contained in a circle centered at (3,3) and radius 5.");
        int  r = 5;
        int[] X = {1,8,9,6,2,3,5,4,1,0};
        int[] Y = {1,0,2,3,4,4,9,7,-1,2};

        for (int i = 0; i < 10; i++) {
            if(X[i]*X[i] + Y[i]*Y[i] <= r*r){
                System.out.print("("+X[i]+" "+Y[i]+")");
            }
        }

        System.out.println("2\nSum of words in rows and columns.");
        int[][] random = new int[6][5];
        for(int i = 0;i <6;i++){
            for(int j = 0; j< 5;j++){
                random[i][j] = (int)(Math.random()*(200-0+1)+0);
            }
        }
        for(int i = 0;i <6;i++){
            int sum = 0;
            for(int j = 0; j< 5;j++){
                sum += random[i][j];
            }
            System.out.print("(row = "+(i+1)+" sum = "+sum+")\n");
        }

        for(int i = 0;i <5;i++){
            int sum = 0;
            for(int j = 0; j< 6;j++){
                sum += random[j][i];
            }
            System.out.print("(column = "+(i+1)+" sum = "+sum+")");
        }
    }
}