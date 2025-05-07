package JAVA2CODE;
abstract class payment{//incomplete body and iska obj nahi bn sakta   
    abstract void pay(int a);//but iske child se ise call kar sakte hai
    void success(){
        System.out.println("payment done");
    }
    
}
class upipayment extends payment{
    void pay(int a){
        System.out.println("pay by upi "+a);
    }

} 
class netbanking extends payment{
    void pay(int a){
        System.out.println("pay by netbanking "+a);
    }
}
public class abt {
    public static void main(String[] args) {
        //payment obj=new payment() {//ye call nahi hoga
            payment obj=new upipayment();
            obj.pay(20000);
            obj.success();
            payment obj1=new netbanking();
            obj1.pay(24000);
            obj.success();


        
        
    }
    
}
