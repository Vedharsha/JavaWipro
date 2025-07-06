import java.util.Scanner;
public class LargeSmallTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = s.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int max=0,second=0,min=Integer.MAX_VALUE,sec_min=Integer.MAX_VALUE;
        for(int i=n-1;i>0;i--) {
            max = max < a[i] ? a[i] : max;
            second = second < a[i] && a[i] < max ? a[i] : second;
            if (a[i] < min) {
                sec_min = min;
                min = a[i];
            } else if (a[i] > min && a[i] < sec_min) {
                sec_min = a[i];
            }

        }
        System.out.println("Second Largest "+second);
        System.out.println("Second smallest "+sec_min);

    }
}