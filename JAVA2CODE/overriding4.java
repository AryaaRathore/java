package JAVA2CODE;
class person{
    void name(){
        System.out.println("Arya Rathore");
    }
}
class displayDetails extends person{
    void age(){
        System.out.println("19");
        
    }
}
public class overriding4 {
    public static void main(String[] args) {
        person obj=new displayDetails();
        obj.name();
        

        
    }
    
}
