import java.util.*;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=s.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}