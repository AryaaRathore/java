package JAVA2CODE;
class shape{
    void draw(){
        System.out.println("drawing");

    }

    }
    class circle extends shape{
        void draw(){
            System.out.println("this draw");
        }
    }
    class square extends shape{
        void draw(){
            System.out.println("drawww");
            super.draw();
        }
    }


public class over2 {
    public static void main(String[] args) {
        shape obj= new circle();
        shape obj1=new square();
        obj.draw();
        obj1.draw();

        
    }

    
}
