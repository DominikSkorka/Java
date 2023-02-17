public class Main {
    public static void main(String[] args) {
        int i = 5, j = 6;
        while(i > 0){
            System.out.println(i);
            i--;
        }
        System.out.println();
//-----------------------------------------------------------
        do{
            System.out.println(j);
            j++;
        }while(j < 10);
        System.out.println();
//-----------------------------------------------------------
        for(int k = 5; k > 0; k--){
            System.out.println(k);
        }
    }
}