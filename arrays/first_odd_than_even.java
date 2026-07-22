import java.util.Arrays;

public class first_odd_than_even {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

       //print odd number 
        for(int i=0;i<arr.length;i++){
              if(arr[i]%2!=0){
               
                System.out.print(arr[i]+" ");
            }
        }
        //print Even number
           for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    System.out.print(arr[i]+" ");
                }
            }

        }
          
        
        
    }

