import java.util.HashSet;

public class print_duplicate_using_hashset {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();

        for(int i=0;i<arr.length;i++){
         if (seen.contains(arr[i])) {
            duplicate.add(arr[i]);
         }else{
            seen.add(arr[i]);
         }
        }

        System.out.println(seen);
        System.out.println(duplicate);
    }
}
