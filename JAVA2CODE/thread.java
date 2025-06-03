package JAVA2CODE;
class MyThread extends Thread{
    public void run(){
        System.out.println("basuri");
    }
}
public class thread {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();
        System.out.println("dhun");
    }
    
}
