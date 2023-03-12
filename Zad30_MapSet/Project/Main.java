package Project;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Warsaw");
        list.add("Cracow");
        list.add("Wroclaw");
        list.add("Wroclaw");
        for(String  e : list){
            System.out.println(e);
        }
        System.out.println(list.size());
        list.clear();


        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(5,"five");
        map.put(9,"nine");
        System.out.println();
        System.out.println(map.get(9));

        System.out.println();
        for(String e: map.values()){
            System.out.println(e);
        }
        LinkedHashSet<String> items = new LinkedHashSet<>();
        //linked hash set remembers the order
        items.add("cat");
        items.add("dog");
        items.add("lion");
        items.add("lion");
        items.add("lion");

        System.out.println();
        for(String e: items){
            System.out.println(e);
        }
        System.out.println(items.size());
    }
}