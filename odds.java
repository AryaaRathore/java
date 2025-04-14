import java.util.Scanner;

public class odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        

        switch(n%2){
            case 0:
            System.out.println("even");
            break;
            case 1:
            System.out.println("odd");
            break;
        }
    }
    
}
