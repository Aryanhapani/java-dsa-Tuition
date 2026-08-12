import java.util.Arrays;

public class second_largest_elements_sorting {
    public static void main(String[] args) {
        int arr[]={5,10,9,4,13,6,13};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
        if (arr[i] > max) {
            sec=max;
            max=arr[i];
        }else if(max != arr[i] && sec < arr[i]){
                sec=arr[i];
        }

    }
    System.out.println(sec);
    }
}
