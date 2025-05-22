 interface walkable {
    void walk();
 }
 interface runable {
void run();
    
}
 class Human implements walkable,runable {
    public void walk(){
        System.out.println("walking");
    }
    public void run(){
        System.out.println("running");
    }
}
   public class multi{
    public static void main(String[] args) {
        Human obj=new Human();
        obj.walk();
        obj.run();
        
    }
}
    

