package JAVA2CODE;
abstract class Shape{
    abstract void area(int r,int c);

    void complete(){
        System.out.println("it is compleate area");
    }

}
class Circle extends Shape{
    void area(int r,int c){
        double pi=3.14;
        System.out.println(pi*(r*r));
    }

}
class Rectangle extends Shape{
    void area(int r,int c){
        System.out.println(r*c);
    }
}
public class Abt2 {
    public static void main(String[] args) {
        Shape obj=new Circle();
        obj.area(5,0);
        obj.complete();
        Shape obj1=new Rectangle();
        obj1.area(2,4);
        obj.complete();
        
    }
    
}
