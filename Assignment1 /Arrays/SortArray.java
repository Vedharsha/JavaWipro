public class SortArray {
    public static void main(String[] args) {
        int[] a={5,89,2,44,19};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}