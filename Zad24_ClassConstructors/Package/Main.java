package Package;

public class Main {
    public static void main(String[] args) {
        Human Dominik = new Human("Dominik");

       // Dominik.name = "Dominik";
        System.out.println(Dominik.name);
        System.out.println(Human.members);

        Human Alona = new Human("Alona");
        Alona.name = "Alona";
        System.out.println(Human.members);
    }
}