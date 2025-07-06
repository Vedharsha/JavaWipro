import java.util.*;
public class InterestPercent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter gender ");
        String gender=s.next();
        System.out.println("Enter age ");
        int age=s.nextInt();
        if(gender.equals("Female") && age>0 &&age<59){
            System.out.println("The percentage Interest is 8.2%");
        }
        else if(gender.equals("Female") && age>58 &&age<=100){
            System.out.println("The percentage Interest is 9.2%");
        }
        else if(gender.equals("Male") && age>0 &&age<=58){
            System.out.println("The percentage Interest is 8.4%");
        }
        else if(gender.equals("Male") && age>58 &&age<=100){
            System.out.println("The percentage Interest is 10.5%");
        }
    }
}