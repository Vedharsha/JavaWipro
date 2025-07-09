public class MatrixReverse {
    public static void main(String[] args) {
        if(args.length < 4)
            System.out.println("Please enter 4 integer numbers");
        else{
            int[][] a={
                    {Integer.parseInt(args[0]),Integer.parseInt(args[1])},
                    {Integer.parseInt(args[2]),Integer.parseInt(args[3])}
                    };

            int temp=a[0][0];
            a[0][0]=a[1][1];
            a[1][1]=temp;
            temp=a[0][1];
            a[0][1]=a[1][0];
            a[1][0]=temp;
            System.out.println("Reversed Matrix:");
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(a[k][j] + " ");
                }
                System.out.println();
            }
        }
    }
}