public class revString {
    public static void main(String[] args) {
        String str = "arya";
        String rev="";
         
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
            
        }
        System.out.print(rev);
    }
    
}
