package JAVA2CODE;



    class withdraw extends Thread
{
   static int totalbalance =1000;
    int amount;
     
    public withdraw(int amount)
    {
        this.amount=amount;
       
    }

    public void run()
    {
        synchronized(withdraw.class)
        {
        
        if(totalbalance>=amount)
        {
            System.out.println("withdraw amount"+amount);
            try
            {
                Thread.sleep(2000);

            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            totalbalance=totalbalance-amount;
            System.out.println("Total balance is "+totalbalance);
        }

        else
        {
                System.out.println("not valid");
        }
        }
    }
}
public class synbalance
 {
    public static void main(String[] args) 
    {
        withdraw b1=new withdraw(800);
        withdraw b2=new withdraw(700);
        b1.start();
       
       b2.start();

    }
}

    

