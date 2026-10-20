import java.util.HashSet;

public class array2_subset_of_array1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,5};

        HashSet<Integer> a1=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            a1.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if (!a1.contains(arr2[i])) {
                System.out.println("false");
                return ;
            }
        }
        System.out.println("true");
    }
}
