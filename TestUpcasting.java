class employee{
    void work(){
        System.out.println("employee works");
    }
}
class manager extends employee{
    void work(){
        System.out.println("manager manages the team");
    }
}
public class TestUpcasting{
    public static void main(String[]args){
        employee e=new manager();
        e.work();
    }
}