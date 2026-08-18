public class find_element_matrix {
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
        int k=800;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==k){
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}
