import java.util.Arrays;

public class Reverse_an_array_in_memory {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        int first=0;
        int last=arr.length-1;

        while (first < last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
