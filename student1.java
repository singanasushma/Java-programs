public class student1{
    private String name;
    private student1(String name){
        this.name=name;
    }
    public static student1 createObject(String name){
        return new student1(name);
    }
    public void display(){
        System.out.println("name:"+name);
    }

}
class mainclass21{
    public static void main(String[]args){
        student1 s2=student1.createObject("sujatha");
        s2.display();
    }
}