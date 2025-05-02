//single inheritance
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{//extend means ek class dusri class ko inherite kar rahi hai
    void bark(){
        System.out.println("barking");
    }
}



class inheritance {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.bark();
        obj.eat();

    }
    
}
