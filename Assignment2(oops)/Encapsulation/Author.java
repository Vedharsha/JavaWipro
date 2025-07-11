abstract class A{
    abstract void display();
}
public class Author extends A{
    private String name;
    private String email;
    private char gender;
    Author(){}
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    char getGender(){
        return gender;
    }
    void display(){
        System.out.println("Author Details");
        System.out.println("Author name :"+name+"\nEmail :"+email+"\nGender "+gender);
    }
}