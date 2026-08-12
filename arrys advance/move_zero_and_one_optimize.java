import java.util.Arrays;

public class move_zero_and_one_optimize {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,0,0,1,1,1};

        int s=0;
        int e=arr.length-1;

        while (s <= e) {

            if(arr[s]==0){
                s++;
            }else if(arr[e]==1){
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
