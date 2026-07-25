import java.util.Arrays;

public class split_array_even_length2 {

    public static void main(String[] args) {
        int arr3[]={1,2,3,4,5,6,7,8};

        int arr1[]=new int[arr3.length/2];
        int arr2[]=new int[arr3.length/2];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr3[i];
            arr2[i]=arr3[i + arr3.length/2];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}