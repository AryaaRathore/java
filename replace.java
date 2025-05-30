import java.util.ArrayList;
import java.util.ListIterator;

public class replace {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Ravi"); 
        name.add("aarya");
         name.add("vani"); 
         name.add("priya");
         ListIterator<String> it=name.listIterator();
         while(it.hasNext()){
            String ele=it.next();
            if(ele.length()<=4){
                it.set("bye");
            }
            
         }
         System.out.println(name);
         int count=0;
         while(it.hasPrevious()){
            String ele=it.previous();
            count++;
            if(count!=name.size()){
                it.set("hello");

            }
         }
         System.out.println(name);


    }
    
}
