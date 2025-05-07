//overloading
package JAVA2CODE;
class parent{
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void sub(int a,int b,int c){
        System.out.println(a-b-c);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        parent obj=new parent();
        obj.sub(5, 02);
        obj.sub(5, 02, 01);
        
    }
    
}
