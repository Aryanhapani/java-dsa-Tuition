
import java.util.Arrays;

public class insert_update_delate_find {
    public static int insert(int arr[], int index, int val) {
        int i=index-1;

        while (i>=0 && arr[i] > val){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=val;
        index++;

      return index;

    }

    public static void find(int arr[],int index,int targetval){
        int s=0;
        int e=index-1;
        while (s <= e) {
            int mid=(s+e)/2;

            if(arr[mid]==targetval){
                System.out.println("found index at:-"+mid);
                return;

            }else if(arr[mid] < targetval){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println("not found");
    }

    public static int del(int arr[],int index,int val){
        for(int i=0;i<index;i++){

            if(arr[i]==val){

                for(int j=i;j<index-1;j++){
                    arr[j]=arr[j+1];
                }
                index--;
                i--;
            }
        }

        return index;
    }

    public static int update(int arr[],int index,int oldval,int newval){
        index=del(arr, index, oldval);
        index=insert(arr, index, newval);

        return index;
    }


    public static void display(int arr[],int index){
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        int index=0;
        
        index=insert(arr, index,10);
        index=insert(arr, index,400);
        index=insert(arr, index,200);
        index=insert(arr, index,50);
        index=insert(arr, index,50);
        find(arr, index, 2600);
        index=del(arr, index, 50);
        index=insert(arr, index,50);
        index=insert(arr, index,50);
        update(arr, index, 400,15 );
        display(arr, index);
       
      
        
        System.out.println(Arrays.toString(arr));
    }
}
