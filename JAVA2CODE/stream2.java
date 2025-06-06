package JAVA2CODE;

import java.util.ArrayList;

public class stream2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
         list.add(2);
          list.add(3);
           list.add(4);
            list.add(5);
             list.add(6);
              list.add(7);
               list.add(1);

               int count =0;

               //  int sum=list.stream().reduce(0,(a,b )->a+b);
              //System.out.println(sum);

                //int sub=list.stream().reduce(0,(a,b )->a-b);
              //System.out.println(sub);

                //int div=list.stream().reduce(1,(a,b )->a/b);
             // System.out.println(div);

                //int multi=list.stream().reduce(1,(a,b )->a*b);
             // System.out.println(multi);

               // int mod=list.stream().reduce(0,(a,b )->a%b);
            //  System.out.println(mod);

            
                int equal=list.stream().reduce(0,(a,b )->a==b?a:b);
             System.out.println(equal);

             //int max=list.stream().reduce(0,(a,b )->a>b?a:b);
            // System.out.println(max);

                int min=list.stream().reduce(0,(a,b )->a<b?a:b);
              System.out.println(min);

                
        
    }
    
}
