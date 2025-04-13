public class factorial {
    public static void main(String[] args) {
        int num=5;
        int fact =1;
        for(int i =1;i<=num;i++){
            fact *=i;
        }
        System.out.printf("fact of num %d=%d",num,fact);
    }
    
}
