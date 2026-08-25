public class delete_max_element_form_each_col {
    public static void main(String[] args) {
        int[][]  mat={
            {5,8,4},
            {9,3,4},
            {2,7,6},
        };

        int row=mat.length;
        int col=mat[0].length;

        for(int j=0;j<col;j++){
            int max=0;
            for(int i=1;i<row;i++){
                if(mat[max][j] < mat[i][j]){
                    max=i;
                }
            }
            for(int k=max;k<row-1;k++){ 
                mat[k][j]=mat[k+1][j];
            }
        }
        row--;


        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
