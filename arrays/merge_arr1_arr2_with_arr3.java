import java.util.Arrays;

public class merge_arr1_arr2_with_arr3 {
    public static void main(String[] args) {
       
        int arr1[]={1,2,3,4,5};
       int arr2[]={10,20,30,40,50};
        int arr3[]=new int[arr1.length + arr2.length];

         int index=0;
        for(int i=0;i<arr1.length;i++){
            arr3[index]=arr1[i];
            arr3[index2]=arr2[i];
            
           
        }
        
        
        int index2=1;
        for(int i=0;i<arr2.length;i++){
            index2=index2+2;
        }

    
       
       
        System.out.println(Arrays.toString(arr3));
    }
}
