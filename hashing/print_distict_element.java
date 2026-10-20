import java.util.HashSet;

public class print_distict_element {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};

        HashSet<Integer> copyarr=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            copyarr.add(arr[i]);
        }

        System.out.println(copyarr);
    }
}
