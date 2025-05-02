class shape{
    void draw(){
        System.out.println("drawing");
    }
}
class circle extends shape{
    void calculateArea(){
        System.out.println("formula");
    }
}
public class shap {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.calculateArea();
        obj.draw();
    }
    
}
