class book{
    void read(){
        System.out.println("reading");
    }
}
class Novel extends book{
    void storyline(){
        System.out.println("read story");
    }
}
public class library {
    public static void main(String[] args) {
        Novel obj =new Novel();
        obj.read();
        obj.storyline();
        
    }
    
}
