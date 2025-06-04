package JAVA2CODE;
class MyRunnable implements Runnable{//runnable predefine hai
    public void run(){
        System.out.println(Thread.currentThread().getName()+"hii");
    }

}
public class threadInterface {
    public static void main(String[] args) {
        MyRunnable obj=new MyRunnable();
        Thread b1=new Thread(obj);
        b1.start();
        try{
            b1.join();//
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
    
}
