package Objects;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Animal();
        Animal Cat = new Animal();

        Dog.voice = "Heow";
        Dog.name = "Reks";
        System.out.println(Dog.voice);

        Cat.introduceYourself();
        Cat.giveVoice(3);
        System.out.println();
        Dog.introduceYourself();
        Dog.giveVoice(5);

        System.out.println();
        Animal Lion = new Animal();
        Lion.name = "Alex";
        Lion.introduceYourself();
        System.out.println(Lion.voice);
        Animal Mouse = new Animal();


        System.out.println(Animal.numbers);
    }
}

