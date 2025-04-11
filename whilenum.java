import java.util.Scanner;

public class whilenum {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value i");
        int i = sc.nextInt();
        System.out.println("enter value n");
        int n = sc.nextInt();
    
        for(i=1;i<=n ; i++) {
        
            System.out.println(i);
            
        }
    }
    
}
