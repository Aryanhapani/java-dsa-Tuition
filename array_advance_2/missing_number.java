public class missing_number {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7};
        int n=arr.length+1;
         
        for(int i=1;i<=n;i++){
            Boolean print=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    print=true;
                    break;
                }
            }
            if(!print){
                System.out.println(i);
            }

        }
    }
        
           }
         
        
    

