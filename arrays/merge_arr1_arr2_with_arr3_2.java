import java.util.Arrays;

public class merge_arr1_arr2_with_arr3_2 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={11,22,33,44};
        int arr3[]=new int[arr1.length + arr2.length];
         
        int index=0;
        for(int i=0;i<arr1.length;i++){
            arr3[index++]=arr1[i];
            arr3[index++]=arr2[i];

        }
        System.out.println(Arrays.toString(arr3));


    }
}
