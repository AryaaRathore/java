package JAVA2CODE;
class Temperature{
    private int celsius;
 void setCelsius(int celsius) {
        this.celsius = celsius;
    }
    void getFahrenheit(){
        System.out.println(273+celsius);
    }

}
public class main2 {
    public static void main(String[] args) {
        Temperature obj=new Temperature();
        obj.setCelsius(230);
        obj.getFahrenheit();
    }
    
}
