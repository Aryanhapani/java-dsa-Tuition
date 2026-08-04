import java.util.Arrays;

public class odd_left_even_right_two_pointer_optimize {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,7,8,9,10,11};

        int s=0;
        int e=arr.length-1;

        while (s < e) {
            if(arr[s]%2!=0){
                s++;
            }else if(arr[e]%2==0){
                e--;
            }else{
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
