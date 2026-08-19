public class print_diagonal_2 {
    public static void main(String[] args) {
         int[][]  mat={
            {5,8,4},
            {9,3,4},
            {2,7,6},
        };

        int row=mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i+j==row-1 || i+j==col-1){
                    System.out.print(mat[i][j]);
                }
            }
        }
    }
}
