import java.util.Scanner;
public class Model3{
    public static String[] part(String s){
        String part1="",part2="",part3="";
        int len=(int)Math.round(s.length()/3.0);
        int rem=s.length()%3;

        part1=s.substring(0,len);
        part2=s.substring(len,s.length()-len);
        part3=s.substring(s.length()-len,s.length());
        
        return new String[]{part1,part2,part3};
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter string1");
        String[] str1=part(s.next());
        System.out.println("Enter string2");
        String[] str2=part(s.next());

        System.out.println("Password");
        System.out.println(str1[1]+str2[2]+str1[0]+str2[0]);

    }
}
