import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=s.nextInt();
        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}