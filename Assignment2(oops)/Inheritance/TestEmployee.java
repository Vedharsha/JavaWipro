public class TestEmployee{
    public static void main(String[] args){
        Employee e=new Employee();
        e.setName("Arun");
        e.setAge(26);
        e.setEmail("arun26@gmail.com");
        e.setPhNum(990099002);
        e.setAnnualSalary(450000);
        e.setStartYear(2025);
        e.setInsuranceNumber("QQ123456C");

        e.showPersonalDetails();
        e.employeeDetails();
        e.showInsuranceNum();
    }
}