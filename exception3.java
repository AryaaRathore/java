import java.util.Scanner;

public class exception3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first value");
        int a=sc.nextInt();
        System.out.println("enter second value");
        int b=sc.nextInt();
        try{
        System.out.println("print result");
        int result=a/b;
        }
        catch(Exception e){
            System.out.println("not divide by zero");
        }
    }
    
}
