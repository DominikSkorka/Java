package Project;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setSurname("Skora");
        System.out.println(s1.getSurname());
        s1.setRating(4);
        System.out.println("Raring: "+s1.getRating());

        System.out.println("");

        s2.setSurname("Ko");
        System.out.println(s2.getSurname());
        s2.setRating(10);
        System.out.println("Raring: "+s2.getRating());
    }
}