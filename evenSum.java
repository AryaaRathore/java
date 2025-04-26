public class evenSum {
    public static void main(String[] args) {
        int sum=123;
        int reminder;
        
        while(sum>0){
        int digit=sum%10;
        reminder=digit;
        sum=sum/10;
        if(reminder%2==0){
            System.out.println(reminder+" even");
        }
        else{
            System.out.println(reminder+" odd");
        }
        }
    }
    
}
