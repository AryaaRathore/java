import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        System.out.println("enter arr value");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
           sum=sum+arr[j];
            
        }
   System.out.println("sum is "+sum);
               }
            } 

