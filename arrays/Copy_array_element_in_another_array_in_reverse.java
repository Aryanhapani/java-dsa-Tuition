import java.util.Arrays;

public class Copy_array_element_in_another_array_in_reverse {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        
        // for(int i=0;i<arr2.length;i++){
        //     arr2[i]=arr1[arr1.length-i-1];
        // }

        // System.out.println(Arrays.toString(arr2));

            int j=0;
        for(int i=arr1.length-1;i>=0;i--){
             arr2[j]=arr1[i];
             j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
