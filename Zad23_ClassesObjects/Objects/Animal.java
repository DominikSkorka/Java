package Objects;

public class Animal {
    String name;
    String voice = "Meow";

    static int numbers = 0;
    Animal(){
        numbers++;
    }
    public void giveVoice(int x){
        for(int i = 0; i <x; i++){
            System.out.println(voice+" ");
        }
    }
    public void introduceYourself(){  //prints to the screen returns nothing
        System.out.println("My name is "+ name);
    }
}
