public class row_and_col_wise_sorted_matrix_find_elemnt_two_pointer {
    public static void main(String[] args) {
         int[][] mat={
            {1,4,7,10},
            {2,5,8,12},
            {3,6,9,15},
            {5,8,11,18},
        };
        int row=mat.length;
        int col=mat[0].length;
        int k=18;

       int i=0;
        int j=col-1;

        while (i< row && j >=0) {
            if(mat[i][j]==k){
                System.out.println("found:-"+mat[i][j]);
                return;
            }else if(mat[i][j] < k){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("not");
    }
}
