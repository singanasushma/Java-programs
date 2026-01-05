package pack1;
public class parent{
    protected void show(){
        System.out.println("protected method");
    }
}
package pack2;
import pack1.parent;
public class Child extends parent{
    public void display(){
        show();
    }
    public static void main(String[]args){
        Child c=new Child();
        c.display();
    }
}