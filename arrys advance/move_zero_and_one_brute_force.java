import java.util.Arrays;

public class move_zero_and_one_brute_force {
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1,1,1,0,0,0,0};
         
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                arr[j]=arr[i];
                j++;
            }
        }

        while (j < arr.length) {
            arr[j]=1;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
