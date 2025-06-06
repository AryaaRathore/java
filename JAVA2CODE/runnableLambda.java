package JAVA2CODE;

public class runnableLambda {
    public static void main(String[] args) {
        Runnable r=()->System.out.println("runnable using lambda");
        r.run();

            Runnable r1=()->System.out.println("runnable using lambda");
        r1.run();

        
    }
    
}
