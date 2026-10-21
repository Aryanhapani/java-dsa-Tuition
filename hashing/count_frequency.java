import java.util.HashMap;
import java.util.Map;

public class count_frequency {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer,Integer> freqcount=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int count=arr[i];
            if (freqcount.containsKey(count)) {
                freqcount.put(count, freqcount.get(count)+1);
            }else{
                freqcount.put(count, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:freqcount.entrySet()){
           System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}
