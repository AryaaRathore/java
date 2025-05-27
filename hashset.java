import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int[] arr={1,2,3,4,4,5,5,6};//not show duplicat element
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);

        }
        System.out.println(set);
    }
    
}
