//character pyramid
public class pyramidc {
    
        public static void main(String[] args) {
            char ch='A';
            for(int i=1;i<=5;i++){
                for(int j=5;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
            
                    
                    System.out.print(ch+"");
                }
                
                System.out.println();
                ch++;
            }
        }
        
    }
    

