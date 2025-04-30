 class AllArmstrong {
    static void Armstrong(int n){
        for(int i=1;i<n;i++){
            int r;
            int sum=0;
            int original=i;
            while(i>0){
                int digit=i%10;
                r=digit;
                sum=sum+(r*r*r);
                i=i/10;
                
            }
        
        if(sum==original){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    } 
    }
    public static void main(String[] args) {
        int n=100;
        Armstrong(n);
    }
    
}
