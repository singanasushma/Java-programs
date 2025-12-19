public class parent1{
    void test(int x){
        System.out.println("parent1 test(int):"+x);
    }
}
class Child extends parent1{
    void test(double x){
        System.out.println("child test(double):"+x);
    }
}
 class mainclass8{
    public static void main(String[]args){
        parent1 c=new Child();
        c.test(10);

    }
}