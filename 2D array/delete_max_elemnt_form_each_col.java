public class delete_max_elemnt_form_each_col {
    public static void del(int mat[][],int max,int row,int col){
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                if(max==mat[i][j]){
                    for(int k=i;k<row-1;k++){
                        mat[k][j]=mat[k+1][j];
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 5, 8, 4 },
                { 9, 3, 4 },
                { 2, 7, 6 },
        };

        int row = mat.length;
        int col = mat[0].length;

        for (int j = 0; j < col; j++) {
            int max = 0;
            for (int i = 0; i < row; i++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
            del(mat, max, row, col);
        }

        for(int j=0;j<col;j++){
            for(int i=0;i<row-1;i++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
