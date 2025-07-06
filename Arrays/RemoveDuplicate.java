import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int l=removeDuplicate(a,n);
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int removeDuplicate(int[] a,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    for(int k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n--;
                }
                else{
                    j++;
                }
            }
        }
        return n;
    }
}
