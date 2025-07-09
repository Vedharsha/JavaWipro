import java.util.Scanner;
public class ArrangeEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] op=new int[n];
        int first=0;
        int last=n-1;
        for(int i=0;i<n && first<=last;i++){
            if(a[i]%2==0){
                op[first]=a[i];
                first++;
            }
            else{
                op[last]=a[i];
                last--;
            }
        }
        for(int i:op){
            System.out.print(i+" ");
        }
    }
}