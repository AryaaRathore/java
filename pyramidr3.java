//reverse character pyramid
public class pyramidr3 {
    public static void main(String[] args) {
        char ch='E';
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ch+"");
            }
            System.out.println();
            ch--;
        }
    }
    
            
    
}
