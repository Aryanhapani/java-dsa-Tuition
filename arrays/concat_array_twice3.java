import java.util.Arrays;

public class concat_array_twice3 {
 public static void main(String[] args) {
    
 
    int arr[]={4,5,6};
    int arr2[]=new int[arr.length*2];


    int i=0;
    int j=arr.length;
    while(i<arr.length){
        arr2[i]=arr[i];
        arr2[j]=arr[i];
        i++;
        j++;
    }
    System.out.println(Arrays.toString(arr2));
    
}}
