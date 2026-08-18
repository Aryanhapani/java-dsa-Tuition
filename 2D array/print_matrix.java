public class print_matrix {
    public static void main(String[] args) {
        int[][] matrix={
            {10,20,30},
            {40,50,60},
            {70,80,90},
            {100,120,130},
            {140,150,160},
        };

        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
