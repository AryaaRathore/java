interface A{
    void sum();
    }
interface B {
    void sum(); 
}
class  C implements A,B{
    public void sum(){
        System.out.println("a+b");
    }
    public static void main(String[] args) {//multiple inheritance
        C obj=new C();
        obj.sum();
    } 
}
