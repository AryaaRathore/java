interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("barking");
    }
}
public class multi3{
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
    }
} 

