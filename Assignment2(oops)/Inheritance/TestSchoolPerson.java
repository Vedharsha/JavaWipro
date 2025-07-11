class SchoolPerson{
    String name;
    int age;
    String city;
    void setPersonDetails(String n,int a,String c){
        name=n;
        age=a;
        city=c;
    }
}
class Teacher extends SchoolPerson{
    int salary;
    String sub_handle;
    void setTeacherDetails(int s,String sub){
        salary=s;
        sub_handle=sub;
    }
    void showTeacherDetails(){
        System.out.println("\nTeacher's Details");
        System.out.println("Name "+name+"\nAge "+age+"\nCity "+city+"\nSalary "+salary+"\nSubject "+sub_handle);
    }
}
class Student extends SchoolPerson{
    int studentId;
    void setStdId(int id){
        studentId=id;
    }
    void showStudentDetails(){
     System.out.println("\nStudent's Details");
        System.out.println("Name "+name+"\nStudent id "+studentId+"\nAge "+age+"\nCity "+city);
     }
}
class CollegeStudent extends Student{
    String collegeName;
    int yearOfStuding;
    void showClgStudentDetails(){
     System.out.println("\nCollege Student's Details");
        System.out.println("Name "+name+"\nStudent id "+studentId+"\nAge "+age+"\nCity "+city);
        System.out.println("College Name "+collegeName);
        System.out.println("Year of Studying "+yearOfStuding);
     }
}
public class TestSchoolPerson{
    public static void main(String[] args){
        Teacher t=new Teacher();
        t.setPersonDetails("Ramu",48,"Chennai");
        t.setTeacherDetails(35000,"Physics");
        t.showTeacherDetails();

        Student s=new Student();
        s.setPersonDetails("Deva",16,"Chennai");
        s.setStdId(17);
        s.showStudentDetails();

        CollegeStudent cs=new CollegeStudent();
        cs.setPersonDetails("Joel",20,"Chennai");
        cs.setStdId(125);
        cs.showStudentDetails();
    }
}