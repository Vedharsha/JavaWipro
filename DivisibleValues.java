public class DivisibleValues {
    public static void main(String[] args) {
        int count=0;
        int n=30;
        while(count<5){
            if(n%2==0 && n%3==0 && n%5==0){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
