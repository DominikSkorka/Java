import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the time of year: ");
        System.out.println("1 for spring, 2 for summer, 3 for autumn, 4 for winter");
        int season = scanner.nextInt();
    switch(season){
        case 1:
            System.out.println("you chose spring");
            break;
        case 2:
            System.out.println("you chose summer");
            break;
        case 3:
            System.out.println("you chose autumn");
            break;
        case 4:
            System.out.println("you chose winter");
            break;
        default:
            System.out.println("there is no number like "+season);
    }
    }
}