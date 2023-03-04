package Project;

public class Student {

    private String surname;         // A variable is only available to the class it is in
    String getSurname(){
        return "Surname: "+ this.surname;
    }
    void setSurname(String surname){
        if(surname.length() >= 4){
            this.surname = surname;
        }
    }

    private int rating;
    int getRating(){
        return this.rating;
    }
    void setRating(int rating){
        if(rating >=1 && rating <= 6){
            this.rating = rating;
        }
    }
}
