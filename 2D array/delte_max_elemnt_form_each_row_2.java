public class delte_max_elemnt_form_each_row_2 {
    public static void main(String[] args) {
          int[][]  mat={
            {5,8,4},
            {9,3,4},
            {2,7,6},
        };

        int row=mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            int max=0;
            for(int j=1;j<col;j++){
                if(mat[i][max] < mat[i][j]){
                    max=j; //max element index
                }
            }
            for(int k=max;k<col-1;k++){
                mat[i][k]=mat[i][k+1];
            }
        }
        col--;

        //print
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
