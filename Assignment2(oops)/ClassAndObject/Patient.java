import java.util.Scanner;
class Patient{
    double computeBMI(String patientName,double height,double weight){
        return (weight/(height*height));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter patient name");
        String name=sc.next();
        System.out.println("Enter height(in meters)");
        double height=sc.nextDouble();
        System.out.println("Enter weight in kg");
        double weight=sc.nextDouble();
        sc.close();
        Patient obj=new Patient();
        System.out.println(obj.computeBMI(name,height,weight));
    }
}