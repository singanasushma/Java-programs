 public class staticrules1{
    int x=10;
    static int y=20;
    static void show(){
        System.out.println(y);
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[]args){
        staticrules1.show();
        staticrules1 obj=new staticrules1();
        obj.display();
        System.out.println(obj.x);
    }
}