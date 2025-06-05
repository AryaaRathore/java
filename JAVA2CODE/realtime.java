package JAVA2CODE;
 class simple
  {
  private boolean signal=false;
  
    public synchronized void sendsignal()
    {
        signal=true;
        System.out.println("producer:send signal....");
        notify();
    }
   public synchronized void waitsignal()
   {
        while(!signal)
        {
            try 
            {
                System.out.println("consumer:wait signal....");
                wait();
            } catch (InterruptedException e)
             {
                // TODO: handle exception
            }
            System.out.println("consumer and producer:signal can proceed.....");

        }

    }
    
 }
public class realtime
 {
    public static void main(String[] args) {
        simple obj=new simple();
        Thread consumer=new Thread(()-> {
            obj.waitsignal();
        }) ;


        Thread producer=new Thread(()->{
           
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            obj.sendsignal();

        });

        consumer.start();
        producer.start();
        
    }
}
    

//sabse pahle class koi bhi
//varible
//function/method synchronized varibletrue print send 
//same code wait signal  while  try catch wait implement wait function call obj banaker call larvana pahle wait thread b call 2 sleep notify function call consumer producer