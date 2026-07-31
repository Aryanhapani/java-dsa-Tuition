public class print_all_duplicate_element {
    public static void main(String[] args) {
       int arr[] = {8, 1, 2, 2, 3, 8, 8, 5};

        for(int i=0;i<arr.length;i++){
            Boolean print=false;
            //check element repeated or not
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    print=true;
                    break;
                }
            }
            if(print){
                continue;
            }

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){

                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    
}