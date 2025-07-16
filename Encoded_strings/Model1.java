import java.util.Scanner;
public class Model1{
    public static String[] part(String s){
        String part1="",part2="",part3="";
            int len=s.length()/3;
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

        System.out.println("Passwords");
        System.out.println("Model 1");
        System.out.println((str2[0]+str1[0]+str1[2]+str2[2]));
        
        System.out.println("\nModel 2");
        System.out.println(str1[1]+str2[1]+str2[0]);

        System.out.println("\nModel 3");
        System.out.println(str1[1]+str2[2]+str1[0]+str2[0]);

        System.out.println("\nModel 4");
        System.out.println(str2[2]+str1[1]+str2[1]+str1[0]);

        System.out.println("\nModel 5");
        System.out.println(str2[0]+str1[0]+str1[2]+str2[2]);
    }
}
