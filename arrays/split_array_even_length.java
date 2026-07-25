import java.util.Arrays;

public class split_array_even_length {
    public static void main(String[] args) {
        int arr[]={69,56,345,65,5,545,54,4};
        int n=arr.length/2;
        System.out.println(n);
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
         
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
         
        int plus=0;
        for(int i=arr.length/2;i<arr.length;i++){
            arr2[plus]=arr[i];
            plus++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
