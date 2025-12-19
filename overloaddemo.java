public class overloaddemo{
    void show(int a){
        System.out.println("int method"+a);
    }
    void show(long a){
        System.out.println("long method"+a);
    }
    public static void main(String[]args){
        overloaddemo obj=new overloaddemo();
        obj.show(10);
        obj.show(10L);
    }
}