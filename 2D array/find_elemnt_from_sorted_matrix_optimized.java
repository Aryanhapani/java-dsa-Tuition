public class find_elemnt_from_sorted_matrix_optimized {
    
    public static void main(String[] args) {
         int[][] matrix={
          {10,20,30},
          {40,50,60},
          {70,80,90},
          
        };

        int row=matrix.length;
        int col=matrix[0].length;
        int target=60;

        int sr=0;
        int er=row-1;

        int r=0;;
        while (sr  <= er) {
             int mid=(sr+er)/2;


            if(target >= matrix[mid][0] && target <= matrix[mid][col-1] ){
                r=mid;
               break;
            }else if(matrix[mid][0] > target){
                     er=mid-1;
            }else{
                    sr=mid+1;
            }
             
        }
        System.out.println(r);
 
       int l=0;
       int m=col-1;
       while (l<=m) {
           int ele=(l+m)/2;

           if(matrix[r][ele]==target){
            System.out.println("target found:-"+matrix[r][ele]);
            return;
           }else if(matrix[r][ele] < target){
               l=ele+1;
           }else{
              m=ele-1;
           }
        
       }
    }
}
