import java.util.Scanner;
public class ShortLongShort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        String res="";
        if(s1.length()>s2.length()){
            res=s2+s1+s2;
        }
        else{
            res=s1+s2+s1;
        }
        System.out.println(res);
    }
}