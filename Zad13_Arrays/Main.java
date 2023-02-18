public class Main {
    public static void main(String[] args) {
        String[] tab = new String[10]; //Amount of elements
        tab[0] = "Dominik";
        tab[1] = "Jacob";
        tab[2] = "Ethan";
        tab[3] = "Emma";
        tab[4] = "Olivia";
        tab[5] = "Ava";
        tab[6] = "Michael";
        tab[7] = "Mia";
        // tab[8] = will display null
        tab[9] = "Chloe";
        for(int i = 0; i < tab.length; i++){
            System.out.println(i+ " " +tab[i]);
        }
        System.out.println("Array length: "+tab.length);
//--------------------------------------------------------------------------
        int[] tab1 = {0, 2, 5, 6, 10};
        for(int i = 0; i < tab1.length; i++){
            System.out.println(tab1[i]);
        }
    }
}