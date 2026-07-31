public class find_element_duplicate {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,3,4};
        int x=3;
        int count=0;
        for(int i=0;i<arr.length;i++){

            
                if(arr[i]==x){
                    count++;
                    
                }
            }
            if(count >= 2){
                System.out.println("duplicate");
            }else{
                System.out.println("not");
            }

        }
        
    }

