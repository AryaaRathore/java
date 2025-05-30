import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Shyna");
        names.add("Rubi");
        names.add("Prachi");
        names.add("vaibhav");
        names.add("vishal");
        Iterator<String> it=names.iterator();
        while(it.hasNext()){
            String element=it.next();
            System.out.println(element);
            if(element.startsWith("v")){
            it.remove();
        }
        
    }
    System.out.println(names);
    
}
}
