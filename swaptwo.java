public class swaptwo {
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        swap(10, 13);
    }
    
}
