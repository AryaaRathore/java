package JAVA2CODE;

class BankAccount{
     private int balance;
     void setDeposit(int balance){
       this.balance = balance;
     }
     int getWithdraw(){
        return balance;
     }
}
public class account {
     public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        obj.setDeposit(19000);
        System.out.println(obj.getWithdraw());
     }

    
}
