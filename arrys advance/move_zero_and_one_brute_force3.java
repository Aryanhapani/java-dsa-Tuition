import java.util.Arrays;

public class move_zero_and_one_brute_force3 {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,0,0,0,1,1,1,0,1,0,1,0};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==1 && arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
