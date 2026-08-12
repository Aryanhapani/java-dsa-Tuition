import java.util.Arrays;

public class find_duplicate_sorting {
      public static void main(String[] args) {
        int arr[]={3, 1, 3, 4, 2};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Boolean print=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               System.out.println(arr[i]);
                break;
            }
        }
        
      }
}
