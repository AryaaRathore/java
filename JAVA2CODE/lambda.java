package JAVA2CODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lambda {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Arya");
        list.add("rahul");
        list.add("mohan");
      //  Collections.sort(list,new Comparator<String>() {
        //    public int  compare(String a,String b){
          //      return a.compareTo(b);
            //}
            
        //});

       Collections.sort(list,(a,b)->a.compareTo(b));//code ko minimize karta hai jo kam 4 line me hota hai use km se km line me karna hota hai
       System.out.println(list);
    }
    
}
