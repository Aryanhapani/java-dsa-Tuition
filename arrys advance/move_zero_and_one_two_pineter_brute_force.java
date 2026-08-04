import java.util.Arrays;

public class move_zero_and_one_two_pineter_brute_force {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,0,0,1,1};

        int s=0;
        int e=arr.length-1;

        while (s < e) {
            if(arr[s]==1 && arr[e]==0){
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }else if(arr[s]==1 && arr[e]==1){
                e--;
            }else{
                s++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
