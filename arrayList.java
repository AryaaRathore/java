import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Ram");
        arr.add("shyam");
        arr.add("ghanshyam");
        System.out.println("initial:"+arr);
        arr.remove(1);
        System.out.println("remove:"+arr);
    }
    
}
