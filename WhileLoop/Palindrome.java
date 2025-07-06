import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        int t=n;
        int r=0,sum=0;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        if(t==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}