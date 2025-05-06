class Vehicle{
    void run(){
        System.out.println("it is run");
    }
}
class Bike extends Vehicle{
void run(){
    System.out.println("running");
    super.run();
}
}
public class main1 {
    public static void main(String[] args) {
        Vehicle obj=new Bike();
        obj.run();
        
    }
    
}
