public class find_max_all_col {
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
            int max=0;
                for(int i=0;i<row;i++){
               if(max < matrix[i][j]){
                max=matrix[i][j];
              }
            }
            System.out.println(max);
           
        }
    }
}
