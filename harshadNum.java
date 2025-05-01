public class harshadNum {
    static void harshad_num(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
            if(n%sum==0){
                System.out.println("num is harshad");
            }
            else{
                System.out.println("num is not harshad");
            }
        }
    public static void main(String[] args) {
        int n=12;
        harshad_num(n);
    }
    
}
