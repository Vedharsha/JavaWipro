import java.util.*;
public class SumSixSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int sum=0,six=0,seven=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
            if(a[i]==6) six=i;
            if(a[i]==7) seven=i;
        }
        for(int i=six;i<=seven;i++){
            sum-=a[i];
        }
        System.out.println(sum);
    }
}