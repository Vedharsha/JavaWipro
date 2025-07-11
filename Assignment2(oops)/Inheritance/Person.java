class Person{
   private String name;
    int age;
    String email_id;
    long ph_num;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    void setEmail(String e){
        email_id=e;
    }
    void setPhNum(long n){
        ph_num=n;
    }
    void showPersonalDetails(){
        System.out.println("Personal Details of an employee");
        System.out.println("Name "+name+"\nAge "+age+"\nEmail Id "+email_id+"\nPhone number "+ph_num);
    }
}
