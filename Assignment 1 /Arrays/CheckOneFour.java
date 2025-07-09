import java.util.Scanner;
public class CheckOneFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr size of an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        boolean ans=true;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]!=1 && a[i]!=4){
                    ans=false;
                    break;
                }
            }

        System.out.println(ans);
    }
}