import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number");
        int a = in.nextInt();
        if (a>0) {
            System.out.println("positive");
            
        }
        else if (a<0) {
            System.out.println("negative");

            
        }
        else{
            System.out.println("zero");
        }

    }
    
}
