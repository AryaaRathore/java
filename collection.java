import java.util.ArrayList;
import java.util.Collections;

public class collection {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("8");
        arr.add("7");
        arr.add("3");
        arr.add("17");
        Collections.sort(arr);
        System.out.println(arr);
    }
    
}
