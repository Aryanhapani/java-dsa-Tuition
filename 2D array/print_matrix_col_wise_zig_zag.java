public class print_matrix_col_wise_zig_zag {
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
       

        for(int j=0;j<col;j++){
           
                
                if(j%2!=0){
                    for(int i=row-1;i>=0;i--){
                         System.out.print(matrix[i][j]+" ");
                    }
                }else{
                    for(int i=0;i<row;i++){
                         System.out.print(matrix[i][j]+" ");
                    }
                }
            }
        


    }
}
