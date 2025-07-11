class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
public class ShapeMain{
    public static void main(String[] args) {
        
    
    Shape c=new Circle();
    c.draw();
    c.erase();

    Shape t=new Triangle();
    t.draw();
    t.erase();


    Shape s=new Square();
    s.draw();
    s.erase();
}
}