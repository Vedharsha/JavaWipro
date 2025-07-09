import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int sum=0;
        for (int r=0;n>0;n/=10){
            r=n%10;
            sum+=r;
        }
        System.out.println(sum);
    }
}