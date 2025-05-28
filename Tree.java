import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        int[] arr={1,0,3,8,0,30,45};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    
}
