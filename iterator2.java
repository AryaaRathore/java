import java.util.ArrayList;
import java.util.ListIterator;

public class iterator2 {//forwar
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("shyam");
        name.add("vani");  
         name.add("vaibhav");  
          name.add("vishal");  
           name.add("satya");
           ListIterator<String> it=name.listIterator();
           while (it.hasNext()) {
            String E=it.next();
            System.out.println(E);
           }
           System.out.println(" ");
           while (it.hasPrevious()) {
            String lastvalue=it.previous();
            System.out.println(lastvalue);
           } 
        
    }
    
}
