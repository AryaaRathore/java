import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 2);
        map.put("id2", 2);
        map.forEach((key,value) -> {
            System.out.println(key + value);
 
        });
       // System.out.println(map);
        //System.out.println(map.get("id1"));
        //System.out.println(map.getOrDefault("id0", 0));
        //System.out.println(map.keySet());
        //System.out.println(map.values());
        
    }
    
}
