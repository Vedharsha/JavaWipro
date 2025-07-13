import java.util.Scanner;
public class StarRemove{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        int i=s.indexOf("*");
        System.out.println(s.substring(0,i-1)+s.substring(i+2));
    }
}