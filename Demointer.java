interface A{
    void display();
}
 interface B{
    void display();
 }  
 class Demointer implements A,B{
    public void display(){
        System.out.println("A and B are big");
    }

    public static void main(String[] args) {
        Demointer obj=new Demointer();
        obj.display();   
    }  
}
 
