 public class person2{
    String name;
    int age;
    String gender;
    person2(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
class student1 extends person2{
    int rollno;
    long phno;
    String schoolname;
    student1(String name,int age,String gender,int rollno,long phno,String schoolname){
        super(name,age,gender);
        this.rollno=rollno;
        this.phno=phno;
        this.schoolname=schoolname;
    }
}
class employee1 extends person2{
    String designation;
    int id;
    double salary;
    employee1(String name,int age,String gender,String designation,int id,double salary){
        super(name,age,gender);
        this.designation=designation;
        this.id=id;
        this.salary=salary;
    }
}
class mainclas2{
    public static void main(String[]args){
        person2 p2=new person2("sushma",20,"female");
        student1 s1=new student1("rajesh",20,"male",12345,1234567898,"kormce");
        employee1 e1=new employee1("radhi",23,"female","manager",101,350000);
        System.out.println(p2);
        System.out.println(s1);
        System.out.println(e1);
    
    }
    }