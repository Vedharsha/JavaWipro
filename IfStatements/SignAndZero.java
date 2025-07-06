import java.util.Scanner;
public class SignAndZero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter input");
        int n=s.nextInt();
        if(n==0)
            System.out.println("Zero");
        else if(n>0)
            System.out.println("Positive number");
        else
            System.out.println("Negative numebr");
    }
}