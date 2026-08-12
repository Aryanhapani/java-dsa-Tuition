import java.util.Arrays;

public class rotate_by_rigth_k {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int d1=3;
        int d2=d1%n;
       for(int j=1;j<=d2;j++){
         int t=arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=t;
       }

        System.out.println(Arrays.toString(arr));
    }
}
