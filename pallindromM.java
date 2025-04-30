public class pallindromM {
    static void pallindrom(int n){
        
        int original=n;
        int res=0;
        while(n>0){
            int digit=n%10;
            res=res*10+digit;
            n=n/10;
        }
            if(res==original){
                System.out.println("pallindrom");
            }
            else{
                System.out.println("not pallindrom");
            }
        }
        
        
        public static void main(String[] args) {  
            pallindrom(191);
        }
    
}
