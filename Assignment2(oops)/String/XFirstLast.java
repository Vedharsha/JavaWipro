import java.util.Scanner;
public class XFirstLast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        int start=2147483647,last=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='x'){
                start=i;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(s.length()-i-1)!='x'){
                last=s.length()-i;
               break;
            }
        }
        if(start==2147483647 && last==0 || start >last) System.out.println(s);
        
        else System.out.println(s.substring(start,last));
    }
}