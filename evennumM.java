public class evennumM {
    static void Even(int n){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println("Even "+i);
            }
            else{
                System.out.println("Odd "+i);
            }

        }
    }
    public static void main(String[] args) {
        int n=100;
        Even(n);
    }
    
}
