 class primM {
    static void prime(int n){
       for(int i=2;i<=n/2;i++){
        if(n%i==1){
            System.out.println(" prime");
        }
        else{
            System.out.println("not prime");
        }
       } 
        
        
    }
    public static void main(String[] args) {
        prime(5);
    }
    
}
