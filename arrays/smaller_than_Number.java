import java.util.Arrays;

public class smaller_than_Number {
    public static void main(String[] args) {
        int arr[]={20,8,9,5,13};
        int arr2[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
            arr2[k]=count;
            k++;
        }
        System.out.println(Arrays.toString(arr2));
    }
    
}
