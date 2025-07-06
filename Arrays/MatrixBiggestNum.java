public class MatrixBiggestNum {
    public static void main(String[] args) {
        if(args.length<9){
            System.out.println("Please enter 9 integer numbers ");
        }
        else{
            int max=0;

            System.out.println("The given array is ");
            for(int i=0;i<9;i++){
                int a=Integer.parseInt(args[i]);
                System.out.print(a+" ");
                if((i+1)%3==0) System.out.println();
                max=max>a?max:a;
            }

            System.out.println("The biggest number in the given array is "+max);
        }
    }
}