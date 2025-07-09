import java.util.Scanner;
public class PresenceOfElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = s.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the element to be check for presence");
        int p = s.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            found = false;
            if (a[i] == p) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
}
