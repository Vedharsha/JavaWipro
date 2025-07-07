import java.util.*;
public class TwoDMid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int row=sc.nextInt();
        System.out.println("Enter column size");
        int column=sc.nextInt();
        int mid=column/2;
        int[][] a=new int[row][column];
        int[] op=new int[row];
        int x=0;
        System.out.println("Enter array elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j]=sc.nextInt();
                if(j==mid){
                    op[x]=a[i][j];
                    x++;
                }
            }
        }
        for(int i:op){
            System.out.print(i+" ");
        }
    }
}