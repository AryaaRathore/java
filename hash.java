import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,66,55};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    
}
