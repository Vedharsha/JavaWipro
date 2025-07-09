import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = s.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        int min=Integer.MAX_VALUE,max=0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            min=a[i]<min?a[i]:min;
            max=a[i]>max?a[i]:max;
        }
        System.out.println("Minimum "+min+"\nMaximum "+max);
    }
}
