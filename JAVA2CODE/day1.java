package JAVA2CODE;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            int max=arr[0];
            int min=arr[0];
            
            if(arr[i]>max){
                System.out.println("max"+arr[i]);

            }

            else if(arr[i]<min){
                System.out.println("min"+arr[i]);
            }
    
        }
    
    }
    
}
