import java.util.Arrays;

public class concat_array_twice {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int arrcopy[]=new int[2*arr.length];
        
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            arrcopy[index]=arr[i];
            index++;
        }

        for(int i=0;i<arr.length;i++){
            arrcopy[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(arrcopy));


    }
}
