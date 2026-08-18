import java.util.Arrays;

public class two_sort_array_merge_brute_force {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10,12,14};
        int arr3[]=new int[arr1.length+arr2.length];


        int j=0;
        for(int i=0;i<arr1.length;i++){
            arr3[j]=arr1[i];
            j++;
        }

        for(int i=0;i<arr2.length;i++){
            arr3[j]=arr2[i];
            j++;
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));



    }
}
