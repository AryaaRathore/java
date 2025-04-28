 class sumNatural {
    static void sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){ 
            sum=sum+i;
            System.out.println(sum);
        }
    } 
    public static void main(String[] args) {
        int n=100;
        sum(n);
    }
    
}
