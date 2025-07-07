import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("negative numbers cannot be prime numbers");
        }
        else {
            if (isPrime(n)) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
    public static boolean isPrime(int n){
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}