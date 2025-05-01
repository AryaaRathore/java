public class magicnum {
    static void magic_num(int n){
        int sum=0;
        while(n>0||sum>9){
            if(n==0){
                n=sum;
                sum=0;

            }
            sum=sum+(n%10);
            n=n/10;

        }
        if(sum==1){
            System.out.println("num is magic");
        }
        else{
            System.out.println("num is not magic");
        }
    }
    public static void main(String[] args) {
        magic_num(199);

    }
    
}
