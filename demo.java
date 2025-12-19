class demo{
    void display(int a, float b){
        System.out.println("int a,float b:"+a+","+b);
    }
    void display(float a,int b){
        System.out.println("float a,int b:"+a+","+b);
    }
    public static void main(String[]args){
        demo d=new demo();
        d.display(10,10.5f);
        d.display(10.5f,10);
    }
}