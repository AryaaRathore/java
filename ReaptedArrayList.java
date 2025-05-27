import java.util.ArrayList;

public class ReaptedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(1,6);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
        
    }
    
}
