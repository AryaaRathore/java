import java.util.HashMap;
public class hashmap2 {
    public static void main(String[] args) {
      //  String str="programming";
      String str="java is fun and java programming is good";
      String[] newStr=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String ch:newStr){
           map.put(ch, map.getOrDefault(ch,0)+1);// 
        }
            System.out.println(map);
            

            }

        }
    
    

