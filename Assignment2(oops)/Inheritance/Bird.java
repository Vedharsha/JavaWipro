class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
public class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying");
    }
    public static void main(String[] args){
        Animal a=new Animal();
        a.eat();
        a.sleep();
        Bird b=new Bird();
        System.out.println("\nUsing child instance");
        b.eat();
        b.sleep();
        b.fly();
    }
}