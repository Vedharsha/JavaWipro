import java.util.*;
public class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String s=sc.next();
        s=s.toLowerCase();
        sc.close();
        boolean isPalindrome=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}