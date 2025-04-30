public class armstrong {
    static void armstrong_number(int a){
        int r;
        int sum=0;
        int original=a;
        while(a>0){
            int digit =a%10;
            r=digit;
            a=a/10;
            sum=sum+(r*r*r);
        }
            if(sum==original){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        
        }
    } 

    
    public static void main(String[] args) {
        armstrong_number(153);
    }
    
}
