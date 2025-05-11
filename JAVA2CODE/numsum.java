package JAVA2CODE;
class Hello{
    int a=12;
    int b=14;
    void sum(){
        this.a=a;
        this.b=b;
    }
    int display(){
        return a+b;
    }
  //  void display(){
    //  System.out.println(a+b);
    //}
}
public class numsum {
    public static void main(String[] args) {
Hello obj=new Hello();
obj.sum();
System.out.println(obj.display());


    }
    
}
