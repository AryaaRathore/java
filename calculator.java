
    

import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first value:");
        int a = in.nextInt();
        System.out.println("enter second value:");
        int b = in.nextInt();
        System.out.println("enter operator");
        char op = in.next().charAt(0);


        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);

            case 6:
                System.out.println("invalid");
        }
    }
}