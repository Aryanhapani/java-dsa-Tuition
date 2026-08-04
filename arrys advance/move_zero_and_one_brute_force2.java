import java.util.Arrays;

public class move_zero_and_one_brute_force2 {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,0,0,0,1,1,1,1,0,0};
        
        int c=0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]==0){
            c++;
         }
        }


        for(int i=0;i<c;i++){
            arr[i]=0;
        }

        for(int i=c ; i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
