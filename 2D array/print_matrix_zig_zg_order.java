public class print_matrix_zig_zg_order {
    public static void main(String[] args) {
         int[][] matrix={
          {10,20,30},
          {40,50,60},
          {70,80,90},
          {100,110,120},
          {130,140,150},
        };

        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            

                if(i%2!=0){
                   for(int j=col-1;j>=0;j--){
                        System.out.print(matrix[i][j] + " ");
                   }
                }else{
                    for(int j=0;j<col;j++){
                        System.out.print(matrix[i][j] + " ");
                   }
                }
            }
        }
    }
