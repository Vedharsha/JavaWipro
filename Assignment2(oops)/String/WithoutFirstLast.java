import java.util.Scanner;
public class WithoutFirstLast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String a=sc.next();
        sc.close();
        System.out.println(a.substring(1,a.length()-1));
    }
}