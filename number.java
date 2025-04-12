import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter value ");
    int a = sc.nextInt();
    if(a%5==0 && a%11==0){
        System.out.println("divisible");

    }
    else{
        System.out.println("not divisible");
    }
    }
    
}
