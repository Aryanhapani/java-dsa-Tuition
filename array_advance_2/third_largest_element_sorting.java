import java.util.Arrays;

public class third_largest_element_sorting {
    public static void main(String[] args) {
        int arr[]={5,10,9,4,13,6,13};
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small] > arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max1){
               max3=max2;
               max2=max1;
               max1=arr[i];
            }else if(max2 < arr[i] && max1 != arr[i]){
                max3=max2;
                max2=arr[i];
            }else if(max3 < arr[i] && max2 != arr[i] && max1 != arr[i]){
                max3=arr[i];
            }
        }
        System.out.println(max3);
    }
}
