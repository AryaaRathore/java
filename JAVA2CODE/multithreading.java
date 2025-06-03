package JAVA2CODE; 

    
class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try {
            Thread.sleep(4000);
        }
        catch(Exception e){
        }
        System.out.println("hii");
    }


}
public class multithreading {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
      obj.start();
      System.out.println("Arya");
      
        
    }
    
}
