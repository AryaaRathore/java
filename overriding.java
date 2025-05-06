class Animal{
    void sound(){
        System.out.println("barking");

    }
}
class  Dog extends Animal{
    void sound(){
        System.out.println("it is bark");
        super.sound();
    }
} 

public class overriding {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
        
    }
    
}
