public class duplicatePrint {
  public static void main(String[] args) {
    String str="hello";
    String newstr="";
    for(int i=0;i<str.length();i++){
        int count =-1;
        char c=str.charAt(i);
       // if(newstr.indexOf(c)==-){
       for(int j=i+1;j<str.length();j++)
       {
        if (c == str.charAt(j))
        {
            System.out.println(c);
            break;
        }
       }
        
      if(count!=-1)
      break;  
        
    }

  }  
  
}
