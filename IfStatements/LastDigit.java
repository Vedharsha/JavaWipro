import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[2];
        for(int i=0;i<2;i++){
            a[i]=sc.nextInt();
        }
        if(a[0]%10==a[1]%10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}