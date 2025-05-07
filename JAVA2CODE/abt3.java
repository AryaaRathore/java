package JAVA2CODE;
abstract class Animal{
    abstract void sound();
    
}
class Dog extends Animal {
    void sound(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}
public class abt3 {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
        Animal obj1=new Cat();
        obj1.sound(); 
    }
    
}
