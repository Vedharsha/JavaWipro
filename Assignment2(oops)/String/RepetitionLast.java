import java.util.*;
public class RepetitionLast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        System.out.println("Enter n");
        int n=sc.nextInt();
        sc.close();
        String res="";
        for(int i=0;i<n;i++){
            res+=s.substring(s.length()-n);
        }
        System.out.println(res);
    }
}