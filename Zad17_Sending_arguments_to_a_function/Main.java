public class Main {
    public static void change(int x){
        x += 5;
        System.out.println("Method: "+ x);
    }

    public static void change1(int[] x){
       // x = new int[1];  //un comment it "//"
        x[0] += 5;
        System.out.println("Method: "+ x[0]);
    }
//-------------------------------------------------------------
    public static void main(String[] args) {
        int y = 6;
        change(y);
        System.out.println(y);

        int[] a  ={10};
        change1(a); //10
        System.out.println(a[0]);
    }
}