class student{
    private int marks;
    public void setmarks(int marks){
        this.marks=marks;
    }
    public int getmarks(){
        return marks;
    }
}
    class mainclass10{
        public static void main(String[]args){
            student s1=new student();
            s1.setmarks(50);
            System.out.println(s1.getmarks());


    }
}
