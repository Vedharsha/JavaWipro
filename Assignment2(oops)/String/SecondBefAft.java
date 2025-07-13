import java.util.Scanner;
public class SecondBefAft{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        s1=s1.toLowerCase();
        String s2=sc.next();
         s2=s2.toLowerCase();
        sc.close();
        int len=s1.length()-s2.length();
        int second_len=s2.length();
        String res="";
        for(int i=0;i<=len;i++){
            if(s1.substring(i,i+second_len).equals(s2)){
                if(i!=0 && i + second_len < s1.length())
                     res+=String.valueOf(s1.charAt(i-1))+String.valueOf(s1.charAt(i+second_len));
                else if(i==0  && i + second_len < s1.length()) 
                    res+=String.valueOf(s1.charAt(i+second_len));
                else if (i != 0 && i + second_len == s1.length()) 
                    res+=String.valueOf(s1.charAt(i-1));
            }
        }
        System.out.println(res);

    }
}