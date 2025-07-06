public class Prime {
    public static void main(String[] args) {
        int end=99;
        boolean flag=false;
        for(int j=10;j<=99;j++){
            flag=false;
           for(int i=2;i<j/2;i++){
               if(j%i==0){
                   flag=true;
                   break;
               }
            }
           if(!flag)
               System.out.print(j+" ");
        }
    }
}