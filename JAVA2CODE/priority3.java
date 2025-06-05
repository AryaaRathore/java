package JAVA2CODE;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(getName() +"  priority  "+getPriority());
            Thread.yield();
        }
    }
}
public class priority3 {
    public static void main(String[] args) {
        MyThread b1=new MyThread();
        MyThread b2=new MyThread();

        b1.setName("Aa");
        b2.setName("bb");

        b1.setPriority(Thread.MIN_PRIORITY);
        b2.setPriority(Thread.MAX_PRIORITY);

        b1.start();
        b2.start();
    }
    
}
