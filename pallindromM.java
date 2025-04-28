public class pallindromM {
    static void pallindrom(int n){
        
        int original=n;
        int res=0;
        while(n>0){
            int digit=n%10;
            res=res*10+digit;
            n=n/10;
            if(original==res){
                System.out.println("pallindrom");
            }
        
        }
        
        }
        public static void main(String[] args) {
            
            pallindrom(191);
        }
    
}
