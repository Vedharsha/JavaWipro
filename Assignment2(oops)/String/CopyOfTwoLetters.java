import java.util.Scanner;

public class CopyOfTwoLetters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String s=sc.next();
        sc.close();
        String res="";
        for(int i=0;i<s.length();i++){
            res+=s.substring(0,2);
        }
        System.out.println(res);
    }
}