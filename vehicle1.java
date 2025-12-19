class vehicle1{
    final void startengine(){
        System.out.println("engine is starting");
    }
}
class car extends vehicle1{
    void running(){
        System.out.println("car engine starting differntly");
    }
}
class mainclass7{
    public static void main(String[]args){
        car c1=new car();
        c1.startengine();
    }
}