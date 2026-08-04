import java.util.Arrays;

public class odd_left_even_right_two_pointer_brute {
  public static void main(String[] args) {
    int arr[]={2,3,4,5,6,7,8,10,11,14,15};

    int s=0;
    int e=arr.length-1;

    while (s < e) {
        if(arr[s]%2==0 && arr[e]%2!=0){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }else if(arr[s]%2!=0 && arr[e]%2!=0){
            s++;
        }else if(arr[s]%2!=0 && arr[e]%2==0){
            s++;
        }else{
            e--;
        }
        
    }
    System.out.println(Arrays.toString(arr));
  }
}
