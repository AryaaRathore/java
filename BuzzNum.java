public class BuzzNum {
    static void buzz_num(int n){
        if(n%7==0){
            System.out.println("number is buzz");
        }
        else if(n%10==7){
            System.out.println(" buzz number");
        }
        else{
            System.out.println("number is not buzz");
        }
    }
    public static void main(String[] args) {
        buzz_num(27);
    }
}
