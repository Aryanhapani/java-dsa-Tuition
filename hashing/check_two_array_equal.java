import java.util.HashMap;
import java.util.Map;

public class check_two_array_equal {
    public static void main(String[] args) {
          int[] arr1={1,2,2,3};
        int[] arr2={2,3,2,1};

        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        for (int i = 0; i < arr1.length; i++) {
            int count=arr1[i];
            if (map1.containsKey(count)) {
                map1.put(count,map1.get(count)+1);
            }else{
                map1.put(count,1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int count=arr2[i];
            if (map2.containsKey(count)) {
                map2.put(count,map2.get(count)+1);
            }else{
                map2.put(count,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry1 : map1.entrySet()) {
            System.out.println(entry1.getKey()+" "+entry1.getValue());
        }
        for (Map.Entry<Integer,Integer> entry2 : map2.entrySet()) {
            System.out.println(entry2.getKey()+" "+entry2.getValue());
        }

        if (map1.equals(map2)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
