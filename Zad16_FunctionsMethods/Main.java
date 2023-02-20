public class Main {
    static void show(){
        System.out.println("Hello World!");
    }
    static String showString(){
        return "Hello World!"; //corrects here once instead of everywhere in the code
    }
    static int showInt(int a){
        return ++a;
    }
    static int showInt(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        show();

        String h = showString();
        System.out.println(h);

        System.out.println(showString()); //You can do this, but only once because then it gets lost in the code

        System.out.println(showInt(5));
        System.out.println(showInt(5,10 ));
    }
}