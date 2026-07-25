import java.util.Arrays;

public class even_length_array_two_array_part {
     public static void main(String[] args) {
         int arr3[]={9,2,5,7,3,8,9,0};
         int arr1[]=new int[arr3.length/2];
         int arr2[]=new int[arr3.length/2];

         for(int i=0;i<arr1.length;i++){
            arr1[i]=arr3[i];
            arr2[i]=arr3[i+ arr3.length/2];
         }
         System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));
 }   
}
