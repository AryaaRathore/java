package JAVA2CODE;
class Vehicle{
    void speed(){
        System.out.println("fast");
    }
}
class Car extends Vehicle{
    void speed(){
        System.out.println("slow");
        super.speed();
    }
}
public class Runtime {
    public static void main(String[] args) {
        Vehicle obj=new Car();
        obj.speed();
        
    }
    
}
