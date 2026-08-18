public class print_matrix_revrse_order {
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
        
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
