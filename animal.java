public  interface animal{
      void eat();
      void sound();
}
 class Dog implements animal{
     public void eat(){
        System.out.println("dogs eat food");
     }
     public void sound(){
        System.out.println("dogs barks");
     }
}
class mainclass3{
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.sound();
    }
}
