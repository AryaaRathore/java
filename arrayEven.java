import java.util.Scanner;

public class arrayEven {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enter array size");
    int n = sc.nextInt();
    System.out.println("enter arr value");
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
    
        if(arr[i]%2==0){
            System.out.println("even"+arr[i]);
        }
        else{
            System.out.println("odd"+arr[i]);
        }
    }
        
    
    
    
    
    


    }
    
}
