import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        int ss = scanner.nextInt();

        int days = ss / 86400;
        int hours = ss % 86400 /  3600;
        int minutes = ss % 3600 / 60;
        int seconds = ss % 60;

        System.out.print(ss+" seconds is: \n");

        if (days >= 1){
            System.out.print(days + " days, ");
        }
        if (hours >= 1) {
            System.out.print(hours + " hours, ");
        }
        if (minutes >= 1) {
            System.out.print(minutes + " minutes, ");
        }
        System.out.println(seconds + " seconds");
        System.out.println("in real time.");

        System.out.println("\nor\n");

        float min, h ,d, w,m, y;
        min = (float) ss / 60;
        h = (float) ss / 3600 ;
        d = (float) ss / 86400;
        w = (float) ss / 604800;
        m = (float) ss / 2592000;
        y = (float) ss / 31536000 ;


        System.out.printf("%.3f Minutes%n", min);
        System.out.printf("%.3f Hours%n", h);
        System.out.printf("%.3f Days%n", d);
        //2 ways to write code
        System.out.println(String.format("%.3f Weeks", w));
        System.out.println(String.format("%.3f Months", m));
        System.out.println(String.format("%.3f Year", y));

    }
}