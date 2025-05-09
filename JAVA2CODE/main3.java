package JAVA2CODE;
class Rectangle{
    private int l;
    private int w;
     void setArea(int l,int w) {
        this.l =l;
        this.w=w;
    }
    void getArea(){
        System.out.println("parameter "+2*(l+w));
        System.out.println("area "+l*w);
    }
}
public class main3 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.setArea(4, 5);
    obj.getArea();                                       ;
        
    }
    
}
