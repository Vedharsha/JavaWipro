import java.util.*;
public class AlternativeLetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string one");
        String s1=sc.next();
        System.out.println("Enter string 2");
        String s2=sc.next();
        sc.close();
        int len=s1.length()>s2.length()?s2.length():s1.length();
        String res="";
        for(int i=0;i<len;i++){
            res+=String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(i));
        }
        if(s1.length()>s2.length()){
            res+=s1.substring(len,s1.length());
        }
        else if(s1.length()<s2.length()){
             res+=s2.substring(len,s2.length());
        }
        System.out.println(res);
    }
}