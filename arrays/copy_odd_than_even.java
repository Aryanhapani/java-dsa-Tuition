import java.util.Arrays;

public class copy_odd_than_even {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        int index=0;

        //for odd
        for(int i=0;i<arr2.length;i++){
            if(arr1[i]%2!=0){
                arr2[index]=arr1[i];
                index++;
            }
        }

        //for Even

        for(int i=0;i<arr2.length;i++){
            if(arr1[i]%2==0){
                arr2[index]=arr1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr2));
        
    }
}
