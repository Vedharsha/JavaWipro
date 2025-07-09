import java.lang.Math;
public class Calculator {
    public static int powerInt(int num1,int num2){
        return (int)Math.pow(num1,num2);
    }
    public double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(powerInt(2,5));
        System.out.println(obj.powerDouble(10.0d,2.0d));
        obj.close();
    }
}
