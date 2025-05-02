//multiple level class
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
    class puppy extends Dog{
        void lazy(){
            System.out.println("cute");
        }
    }




public class inheritanceTwo {
    public static void main(String[] args) {
        puppy obj =new puppy();
        obj.bark();
        obj.eat();
        obj.lazy();
    }
    
}
