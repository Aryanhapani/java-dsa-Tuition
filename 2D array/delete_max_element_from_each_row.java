public class delete_max_element_from_each_row {

    //max delete
    public static void del(int mat[][],int max,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(max==mat[i][j]){
                    for(int k=j;k<col-1;k++){
                        
                            mat[i][k]=mat[i][k+1];
                         }
                         
                }
                        
            }
        }

    }
    public static void main(String[] args) {
        int[][]  mat={
            {5,8,4},
            {9,3,4},
            {2,7,6},
        };

        int row=mat.length;
        int col=mat[0].length;

        //max find
        for(int i=0;i<row;i++){
            int max=0;
            for(int j=0;j<col;j++){
                if(max < mat[i][j])
                max=mat[i][j];
            }
            del(mat, max, row, col);
        }
       
        //print
        for(int i=0;i<row;i++){
            for(int j=0;j<col-1;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
