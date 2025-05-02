class device{
    void poweron(){
        System.out.println("on");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("booting");
    }
}
class GamingLaptop extends laptop{
    void startgame(){
        System.out.println("start");
    }
} 
public class electronic {
    public static void main(String[] args) {
        GamingLaptop obj=new GamingLaptop();
        obj.poweron();
        obj.boot();
        obj.startgame();

        
    }
    
}
