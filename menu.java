import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("select your choice(1 to 4) :");
         int op=sc .nextInt();
        switch(op){
            case 1:
            System.out.println("enter number a:");
             a= sc.nextInt();
            System.out.println("enter number b:");
            b = sc.nextInt();
            System.out.println("Addition = " + (a+b));
            break;

            case 2:
            System.out.println("enter number a :");
             a= sc.nextInt();
            System.out.println("enter number b:");
             b = sc.nextInt();
            System.out.println("Subtraction = " + (a-b));
            break;


             case 3:
            System.out.println("enter number a:");
             a= sc.nextInt();
            System.out.println("enter number b:");
             b = sc.nextInt();
            System.out.println("Multiplication =" + (a*b));
            break;


             case 4:
            System.out.println("enter number a:");
             a= sc.nextInt();
            System.out.println("enter number b:");
             b = sc.nextInt();
            System.out.println("Division = " + (a/b));
            break;

            default:
            System.out.println("Invalid choice");
            break;
            
            

        }
    }
    
}
