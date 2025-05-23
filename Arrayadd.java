import java.util.ArrayList;

public class Arrayadd {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        System.out.println("initial array:");
        arr.add("Astha");
        arr.add("Jiya");
        arr.add("sheezal");
        arr.add("khushi");
        System.out.println(arr);
       System.out.println("add person:");
        arr.add(3, "muskan");//kisi person ko uski jagah add karna
        System.out.println(arr);
        System.out.println("remove sheezal:");
        arr.set(2, "vazi");
        System.out.println(arr);
        System.out.println(arr.get(0));
    }
    
}
