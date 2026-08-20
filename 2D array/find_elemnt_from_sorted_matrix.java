public class find_elemnt_from_sorted_matrix {

    public static void main(String[] args) {
        int[][] matrix={
          {10,20,30},
          {40,50,60},
          {70,80,90},
          
        };

        int row=matrix.length;
        int col=matrix[0].length;
        int target=60;

      
       int r=0;
        for(int i=0;i<row;i++){
           if(target >= matrix[i][0] && target <= matrix[i][col-1]  ){
              r=i;
              break;
           }
           
        }
        System.out.println(r);

        int l=0;
        int m=col-1;

        while (l<=m) {
            int mid=(l+m)/2;

            if(target==matrix[r][mid]){
                System.out.println("found:-"+matrix[r][mid]);
                return;
            }else if(matrix[r][mid] < target){
                l=mid+1;
            }else{
                m=mid-1;
            }
            
        }
        System.out.println("not");
       
    }
}