package JAVA2CODE;

class ATM{
    private int a;

    void setRs(int a){
        this.a=a;
    }
    int getRs(){
    return a;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.setRs(20000);
        System.out.println(obj.getRs());
    }
    
}
