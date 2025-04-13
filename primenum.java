import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        for(int i=2;i<=n/2;++i){
            if(n%i==0){
                System.out.println(" not prime number");
            }
            else{
                System.out.println(" prime number");
            }
        }
    }
    
}
