public class perfectnum {
    static void perfect_num(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
    public static void main(String[] args) {
        perfect_num(6);
    }
    
}
