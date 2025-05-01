public class ducknum {
static void duck_num(int n){
    int rem=0;
    

    while(n>0){
        rem=n%10;
        n=n/10;
    
    
        if(rem==0){
            System.out.println("duck number");
        
    }
    else{
        System.out.println("not duck number");
        
    }
}
}
public static void main(String[] args) {
    duck_num(401);
}
    
}
