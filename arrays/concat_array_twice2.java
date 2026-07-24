import java.util.Arrays;

public class concat_array_twice2 {
    public static void main(String[] args) {
        
    
    int arr[]={1,2,1};
    int copyarr[]=new int[2*arr.length];

    for(int i=0;i<arr.length;i++){
        copyarr[i]=arr[i];
        copyarr[arr.length + i]=arr[i];
    }
    System.out.println(Arrays.toString(copyarr));

}
}
