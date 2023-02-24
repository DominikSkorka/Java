public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = a;
        b = 10;
        System.out.println(a);

        short c = 25;
        int d = c;
        d = 10;
        System.out.println(c);
        System.out.println(d);

        //error bcs of size int is bigger than short
        //     int x = 25;
        //     short z = x;
        //     z = 10;
        //     System.out.println(a);
        System.out.println("\n");

        int x = 25;
        short z = (short)x;
        System.out.println(x);
        System.out.println(z);

        System.out.println("\n");
        int u = Integer.MAX_VALUE;
        short o = (short)u;
        System.out.println(u);
        System.out.println(o);
    }
}