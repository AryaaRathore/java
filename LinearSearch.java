import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array" );
        int n = sc.nextInt();

System.out.println("enter arr value");
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

    }
    System.out.println("enter number to search: ");
    int x=sc.nextInt();
    boolean found=false;
    for(int val:arr){
        if(val==x){
            found=true;
            break;
        }
        if(found){
            System.out.println(x+"is present array");
        }
        else{
            System.out.println(x+"is not present array");

        }

    }
    
}
}
