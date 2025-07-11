class Employee extends Person{
   private double annual_salary;
   private int start_year;
   private String insurance_num;
    void setAnnualSalary(double a){
        annual_salary=a;
    }
    void setStartYear(int a){
        start_year=a;
    }
    void setInsuranceNumber(String insurance_num){
        this.insurance_num=insurance_num;
    }
    void employeeDetails(){
        System.out.println("\nEmployability Details");
        System.out.println("Annual salary :"+annual_salary+"\nStart year :"+start_year);
    }
    void showInsuranceNum(){
        System.out.println("Insurance number "+insurance_num);
    }
}
