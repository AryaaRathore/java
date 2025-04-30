import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        for(int i=2;i<=n/2;++i){
            if(n%i==1){
                System.out.println("  prime number");
            }
            else{
                System.out.println(" not prime number");
            }
        }
    }
    
}
