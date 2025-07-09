import java.util.Scanner;
public class RemoveTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements");
        int x=n-1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==10){
                a[x--]=0;
                i--;
                n--;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}