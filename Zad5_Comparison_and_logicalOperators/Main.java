public class Main {
    public static void main(String[] args) {
        int a = 6, b = 12;


        System.out.println("a= "+a+" b= "+b);

        //false, true
        boolean logic = a == b;

        System.out.println("a == b "+ logic);

        boolean logic1 = a != b;
        System.out.println("a != b "+ logic1);

        boolean logic2 = a > b;  //  <
        System.out.println("a > b  "+ logic2);

        boolean logic3 = a >= b;  // <=
        System.out.println("a >= b "+ logic3);

        System.out.println("");

        //concatenation operator
        boolean concatenation = 5 >= 5 && 6 > 1;   //2 conditions must be met
        System.out.println(concatenation);

        boolean alternative = 5 >= 5 || 6 > 1;  //one of the conditions must be true for it to be true
        System.out.println(alternative);

        boolean connection = (4 > 10 || true) && true;
        System.out.println(connection);

        boolean negation = !(5 == 5);
        System.out.println(negation);
    }
}