package JAVA2CODE;

public class withoutclassThread {
    public static void main(String[] args) {
        System.out.println("hii");
        Thread obj=new Thread(()->{
            System.out.println("bye");
        } );
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Thread obj1=new Thread(()->{
            System.out.println("hello");
        }
        );
        obj.start();
        obj1.start();

    }
    
}
