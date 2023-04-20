package Project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("collection list");
       Animal cat1 = new Animal("Stella");
       Animal cat2 = new Animal("Lucy");
       Animal cat3 = new Animal("Lily");

        Animal dog1 = new Animal("Winston");
        Animal dog2 = new Animal("Riley");
        Animal dog3 = new Animal("Chip");

        ArrayList list = new ArrayList();

        list.add(cat1);
        list.add(cat2);
        list.add(cat3);

        ArrayList<Animal> list2 = new ArrayList<Animal>(); //safer
        list2.add(dog1);
        list2.add(dog2);
        list2.add(dog3);

        System.out.println("------------------");
        for(Object k : list2){
            System.out.println(((Animal)k).name);
        }
        System.out.println("------------------");
//-----------------------------------------------------------
        System.out.println("------------------");
        for(Object k : list){
            System.out.println(((Animal)k).name);
        }
        System.out.println("------------------");

        System.out.println(list.get(0));
        System.out.println(((Animal)list.get(0)).name);

        System.out.println(list.size());
        System.out.println(list.contains(cat2));

//--------------------------------------------------------
                list.remove(cat2);
                list.remove(0);
        System.out.println("------------------");
        for(Object k : list){
            System.out.println(((Animal)k).name);
        }
        System.out.println("------------------");

        System.out.println(list.size());

 //-------------------------------------------------------
        list.clear();
        System.out.println("------------------");
        for(Object k : list){
            System.out.println(((Animal)k).name);
        }
        System.out.println("------------------");
        System.out.println(list.size());
    }
}