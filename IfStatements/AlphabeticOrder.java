import java.util.*;
public class AlphabeticOrder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first character");
        char x=s.next().charAt(0);
        System.out.println("Enter second character");
        char y=s.next().charAt(0);
        if(x<y){
            System.out.println(x+","+y);
        }
        else{
            System.out.println(y+","+x);
        }
    }
}
