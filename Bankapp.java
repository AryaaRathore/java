import java.util.ArrayList;
import java.util.Scanner;



class Transaction{
    String type;
    double amount;
   public Transaction(String type,double amount){
    this.type=type;
    this.amount=amount;
   }

     public String toString() {
        return type + ": Rs. " + amount;
    }
   
     

}
class Account{
    String name;
    int accountnumber;
    double balance;
   ArrayList<Transaction> transaction=new ArrayList<>();
    public Account(String name,int accountnumber,double balance){
        this.name=name;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            transaction.add(new Transaction("Deposite",amount));
            System.out.println("your deposite successfully:");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            transaction.add(new Transaction("withdraw", amount));
            System.out.println("withdraw successfully:");

        }
        else{
            System.out.println("not valid");
        }
    }

    public void checkbalance(){
        System.out.println("current balance"+balance);
    }



}

public class Bankapp {
    static Scanner sc =new Scanner(System.in);
        static Account account;
       public static void main(String[] args) {
    
       
        System.out.println("enter your name:");
        String name=sc.nextLine();
        new Account("arya", 12345678, 50000);
         
        System.out.println("created successfully: account number:");
        

       int choice;

        do{
            System.out.println("/n1.deposit/n2. withdraw/n3. check balance/n4. exit");
            System.out.println("enter your choice"); 
        choice=sc.nextInt();     
          
        
        switch (choice) {

            case 1:
            System.out.println(" enter deposite amount");
            double dep=sc.nextDouble();
            account.deposite(dep);
                break;
            case 2:
            System.out.println("enter withdraw amount");
            double with =sc.nextDouble();
            account.withdraw(with);
                 break;

           case 3:
        
           account.checkbalance();
                break;

          case 4:
          System.out.println("4.exit");
                
                System.out.println("thankyou for using bankapp");
                break;
            
                default:
                System.out.println("invalid choice");
            
        }
        
            
    }  
    while (choice !=4);
     
        
    
        

 
     
    
    }
}

    

