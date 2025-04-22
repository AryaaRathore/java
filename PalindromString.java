public class PalindromString {
    public static void main(String[] args) {
        String str="racecar";
        String res="";

        
       // System.out.println(str.length());

       for(int i=str.length()-1;i>=0;i--){
        res+=str.charAt(i);

        
      
       }
       System.out.println(res);
       if(res.equals(str)){
        System.out.println("palindrom");
       }
       else{
        System.out.println("not palindrom");
       }

       
       }
    }
    

