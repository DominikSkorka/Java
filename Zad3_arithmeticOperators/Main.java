public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;

        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;

        double result4 = (double)a / b;

        int result5 = a % b;  // 25 - 15 = 10 // a = 55, b = 10  55 -50 = 5
        int reuslt6 = 2 + 2 * 2;
        int reuslt7 = (2 + 2) * 2;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(reuslt6);
        System.out.println(reuslt7);

        a+= b;  // a = a + b
        a-= b;  // a = a - b
        a*= b;  // a = a * b
        a%= b;  // a = a % b
        a/= b;  // a = a / b

        System.out.println("");
        a = 3;
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println("");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(9)); //only square roots
        System.out.println(Math.abs(-50));
        System.out.println(Math.PI);



    }
}