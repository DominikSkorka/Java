import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple game");
        int i = 0;
        int anwser;
        int rnd;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        rnd = rand.nextInt(100)+1;
        System.out.println("guess the number from 1 to 100");

        do{
            i++;
            System.out.print("give me a number: ");
            anwser = scanner.nextInt();
            if (anwser > rnd){
                System.out.println("My number is smaller");
            }
            else if(anwser < rnd){
                System.out.println("My number is greater");
            }
        }while (anwser != rnd);
        if(i == 1){
            System.out.println("you are incredibly lucky, you won on the 1st try");
        }else if(i <= 10){
            System.out.println("you won in round: "+i+" you are awesome!");
        }else{
            System.out.println("you won in round: "+i);
        }
    }
}