import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashing_java{
    public static void main(String[] args) {
         HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(2);
        hashset.add(3);
        hashset.add(3);
        System.out.println(hashset);

        for (int element : hashset) {
            System.out.println(element);
        }

        HashMap<String,Integer> hashmap = new HashMap<>();
        hashmap.put("xyz",64876);
        hashmap.put("abc",123);

        //key always have unqiue not copy
        //value use can same for multiple time

        for (Map.Entry me : hashmap.entrySet()) {
            System.out.println(me.getKey()+" " +me.getValue());

        }
    }
}