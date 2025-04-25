public class mutable {
    public static void main(String[] args) {
        String str1 ="hello";
       // System.out.println(str1.concat("hii"));
        //System.out.println(str1);
        StringBuilder str= new StringBuilder("hello");
        str.append("hii");
        System.out.println(str);
    }//
    
}
