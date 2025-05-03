public class primeOnetoHund {
    static void prime_one_hundred(int n){
        int check;
        for(int i=1;i<=100;i++){
            check=0;
            for(int j=2;j<i;j++){
            if(i%j==0){
                check++;
                break;
            }
        }
            if(check==0){
                System.out.println(i);
            }

        }
    }
    
    
    public static void main(String[] args) {
        prime_one_hundred(100);
    }
}
