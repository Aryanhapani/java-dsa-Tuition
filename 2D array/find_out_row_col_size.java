public class find_out_row_col_size{
      public static void main(String[] args) {
        // int[][] matrix=new int[5][3];

        int[][] matrix={
          {10,20,30},
          {40,50,60},
          {70,80,90},
          {100,110,120},
          {130,140,150},
        };

        int row=matrix.length;
        int col=matrix[0].length;
        System.out.println("row size:-"+row);
        System.out.println("col size:-"+col);




      }
}
