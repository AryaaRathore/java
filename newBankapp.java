import java.util.ArrayList;
import java.util.Random;
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
        this.balance=0;
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
     public void viewTransactions() 
     {
        if (transaction.isEmpty()) {
            System.out.println("No transactions yet.");
       } else {
            for (Transaction t : transaction) {      
           System.out.println(t);
             }
        }
     }

   public String getName() {
        return name;
    }

   public int getAccountNumber() {
        return getAccountNumber();
     }




}




public class newBankapp {
    static Scanner sc =new Scanner(System.in);
        static Account account;
       public static void main(String[] args) {
    
       
        System.out.println("enter your name:");
        String name=sc.nextLine();
         int accountno = new Random().nextInt(10000) + 10000;
       
       account = new Account(name, accountno, accountno);
        
         
        System.out.println("created successfully: account number:");
        

       int choice;

        do{
            System.out.println("\n1.deposit  \n2. withdraw\n3. view transaction \n4. check balance \n5. exit");
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
                account.viewTransactions();
                break;
                case 4:
                account.checkbalance();
                break;

          case 5:
          System.out.println("4.exit");
                
                System.out.println("thankyou for using bankapp");
                break;
            
                default:
                System.out.println("invalid choice");
            
        }
        
            
    }  
    while (choice !=5);
    
    
    }
}

    

