import java.util.Scanner;
public class EvnOddString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String a=sc.next();
        int l=a.length();
        sc.close();
        if(l%2==0){
            for(int i=1;i<l;i++){
                if(((int)a.charAt(i))>=65 && ((int) a.charAt(i))<=90){
                    System.out.println(a.substring(0,i));
                    break;
                }
            }
        }
        else{
            System.out.println("null");
        }
    }
}