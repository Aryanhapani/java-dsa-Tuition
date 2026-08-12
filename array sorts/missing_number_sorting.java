import java.lang.reflect.Array;
import java.util.Arrays;

public class missing_number_sorting {
    public static void main(String[] args) {
        int arr[]={3,5,1,2,6};

        // for(int i=1;i<arr.length;i++){
        //     int curr=arr[i];
        //     int prev=i-1;
        //     while (prev >= 0 && arr[prev] > curr) {
        //         arr[prev+1]=arr[prev];
        //         prev--;
                
        //     }
        //     arr[prev+1]=curr;
        // }
        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int n=arr.length+1;
        int expectsum=n*(n+1)/2;
        System.out.println(expectsum);
         
        int sum=0;
        for(int i=0;i<arr.length;i++){
         sum=sum+arr[i];
        }
        System.out.println(expectsum-sum);
    }
}
