import java.util.Scanner;
public class CharacterType {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter character");
        char a=s.next().charAt(0);
        int x=(int)a;
        if(x>96 && x<123 || x>=65 && x<=90){
            System.out.println("Alphabet");
        }
        else if(x>=48 && x<=57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}