import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum "+sum);
        System.out.println("Average "+(float)sum/n);

    }
}