import java.util.Scanner;

public class maximum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int n = sc.nextInt();
    System.out.println("enter element of array");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int j=0;j<arr.length;j++){
    int max=arr[0];
    if(arr[j]>max){
        System.out.println(arr[j]);

    }
    
        
    
    }

  }    
    
}
