public class hcf {
    static void HCF(int a , int b){
        System.out.println(a);
        System.out.println(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("hcf "+a);
    }
    public static void main(String[] args) {
        HCF(6,9 );
    }
    
}
