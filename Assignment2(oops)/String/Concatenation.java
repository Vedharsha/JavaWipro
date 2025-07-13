import java.util.Scanner;

public class Concatenation{
    public static void main(String[] args) {
        System.out.println("Enter two strings in the format (String 1,String 2)");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        sc.close();
        int index;
        if(s1.contains(",")){
        index=s1.indexOf(",");
        }
        else if(s1.contains(" ")){ index=s1.indexOf(" ");}
        else {
            System.out.println("Invalid input format. Please include a comma or space between strings.");
            return;
        }
        if(s1.charAt(s1.length()-1)==s1.charAt(index)){
            s1+=s1.substring(index+2);
        }
        else{
            s1=s1.substring(0,index)+s1.substring(index+1);
        }
        System.out.println(s1);
    }
}