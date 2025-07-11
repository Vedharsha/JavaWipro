class Fruit{
    void eat(String name,String taste){
        System.out.println(name+" is too "+taste+" to eat");
    }
}
class Apple extends Fruit{
    void eat(String name,String taste){
        System.out.println(name+" is too" +taste+" to eat");
        System.out.println("Apple is good for health");
    }
}
class Orange extends Fruit{
     void eat(String name,String taste){
        System.out.println(name+" is too "+taste+" to eat");
        System.out.println("Orange is helps in activation of your body");
     }
     public static void main(String[] args) {
        Orange o=new Orange();
        o.eat("Orange"," sweet");
        Apple a=new Apple();
        a.eat("Apple","tart");
        Fruit f=new Apple();
        f.eat("Gala","sweet");
     }
}