class person{
    void displayname(){
        System.out.println("super");
    } 
}
class student extends person{
    void displayClass(){
        System.out.println("intermediate");
    }
}
class monitor extends student{
    void checkDiscipline(){
        System.out.println("sub");
    }
}

public class multiLevel {
    public static void main(String[] args) {
        monitor obj=new monitor();
        obj.displayname();
        obj.displayClass();
        obj.checkDiscipline();
        

        
    }
    
}
