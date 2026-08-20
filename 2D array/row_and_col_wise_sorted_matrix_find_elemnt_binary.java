public class row_and_col_wise_sorted_matrix_find_elemnt_binary {
    public static void main(String[] args) {
         int[][] mat={
            {1,4,7,10},
            {2,5,8,12},
            {3,6,9,15},
            {5,8,11,18},
        };
        int row=mat.length;
        int col=mat[0].length;
        int k=8;

        for(int i=0;i<row;i++){
            //binary serach in col
            int start=0;
            int end=col-1;
            while (start <= end) {
                int mid=(start+end)/2;

                if(mat[i][mid]==k){
                    System.out.println("found:-"+mat[i][mid]);
                    return;
                }else if(mat[i][mid] < k){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
                
            }
            
            
        }
        System.out.println("not found");

    }
}
