public class row_and_col_wise_sorted_matrix_find_elemnt_brute {

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
            for(int j=0;j<col;j++){
                if(mat[i][j]==k){
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not");

    }
}