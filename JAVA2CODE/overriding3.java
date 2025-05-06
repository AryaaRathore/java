package JAVA2CODE;
class CarEngineStarted{
    void run(){
        System.out.println("running");
    }
}
class car extends CarEngineStarted{
    void run(){
        System.out.println("started engine");
    }
}
public class overriding3 {
    public static void main(String[] args) {
        CarEngineStarted obj=new car();
        obj.run();
        
    }
    
}
