package JAVA2CODE;

import java.util.ArrayList;
import java.util.stream.*;

public class stream {
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(3);
        int count=0;

        
        ArrayList<Integer> data=(ArrayList<Integer>) list.stream().filter(a->a%2==0).collect(Collectors.toList());
        count++;
        System.out.println(data+" "+count+" ");
        
        

    }
    
}
