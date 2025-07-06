import java.util.*;
public class ChangeCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter character");
        char a=s.next().charAt(0);
        int x=(int)a;
        if(a>=65 && a<=90){
            System.out.println((char)(x+32));
        }
        else if(a>=97 && a<=122){
            System.out.println((char)(x-32));
        }
    }
}