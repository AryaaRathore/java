public class swapFbLb {
    static void  first_last(int n){
        int firstdigit;
        int lastdigit;
        int temp=0;
        firstdigit=n/10;
        lastdigit=n%10;
        temp=firstdigit;
        firstdigit=lastdigit;
        lastdigit=temp;
        System.out.println(firstdigit);
        System.out.println(lastdigit);


    }
public static void main(String[] args) {
    first_last(14);
}    
}
