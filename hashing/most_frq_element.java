import java.util.HashMap;
import java.util.Map;

public class most_frq_element {
     public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 1, 4, 2};

     HashMap<Integer,Integer> freqcount=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=arr[i];
            if (freqcount.containsKey(count)) {
                freqcount.put(count, freqcount.get(count)+1);
            }else{
                freqcount.put(count,1);
            }
        }


        int maxfrq=0;
        int maxvalue=0;

        for(Map.Entry<Integer,Integer> entry:freqcount.entrySet()){
            if (entry.getValue()>maxfrq) {
                maxfrq=entry.getValue();
                maxvalue=entry.getKey();
            }
        }

        System.out.println(maxfrq);
        System.out.println(maxvalue);
     }
}
