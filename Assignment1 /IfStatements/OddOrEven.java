import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        if((n&1)==0)
            System.out.println("Even number");
        else{
            System.out.println("Odd number");
        }
    }
}