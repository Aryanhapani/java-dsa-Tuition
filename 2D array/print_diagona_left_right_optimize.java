public class print_diagona_left_right_optimize {
    public static void main(String[] args) {
         int[][] matrix={
          {10,20,30},
          {40,50,60},
          {70,80,90},
          
        };

        int row=matrix.length;
        // int col=matrix[0].length;

        for(int i=0;i<row;i++){
            System.out.print(matrix[i][i]+ " ");
        }
    }
}
