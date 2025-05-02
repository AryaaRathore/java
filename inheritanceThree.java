//hierarichcal inheritance
class Animal{
    void eat(){
        System.out.println("eating");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class cat extends Animal {
    void meow(){
        System.out.println("meow");
    }
}

public class inheritanceThree {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.bark();
        cat obj1=new cat();
        obj1.eat();
        obj1.meow();
    
        
    }
    
}
