public class exception {
    public static void main(String[] args) {
        int a=20,b=0;   //exception means koi yesa statement code me hai jo wrong hai
        //try ke andar jis line me error hai bh btana hai 
        try{
        int c=a/b;
        System.out.println(c);
        }
        catch(Exception e){
            //catch ke undar btana hai ki ye statement divide nahi ho sakta
        System.out.println("it is not divide by zero");
        }
        System.out.println("hello");
        System.out.println("hii");
    }
    
}
