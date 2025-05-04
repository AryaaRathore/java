import java.util.Scanner;

class resgivennum {
    static void reverse_givennum(int a) {
        int remainder;
        int reverse=0;
        
        while(a!=0){
            remainder=a%10;
            reverse=reverse*10+remainder;
            a=a/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter value a");
      int a=sc.nextInt();
        reverse_givennum(a);

    }
    
}
