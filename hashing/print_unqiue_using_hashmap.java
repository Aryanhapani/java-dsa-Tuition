import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class print_unqiue_using_hashmap {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 4, 4, 5};
        HashMap<Integer,Integer> freqcount=new HashMap<>();
        List<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            freqcount.put(arr[i],freqcount.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: freqcount.entrySet()){
            if (entry.getValue()==1) {
                res.add(entry.getKey());
            }
        }

        System.out.println(freqcount);
        System.out.println(res);
    }
}
