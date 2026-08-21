public class minimum_sum_path_reach {
    public static void main(String[] args) {
        int[][] mat={
            {1,3,1},
            {1,5,1},
            {4,2,1},
        };

        int row=mat.length;
        int col=mat[0].length;
 

        // 0 col sum
        for(int i=1;i<col;i++){
            mat[0][i]=mat[0][i]+mat[0][i-1];
        }

        // 0 row  sum

        for(int i=1;i<row;i++){
          mat[i][0]=mat[i][0]+mat[i-1][0];
        }

        //after all with min sum
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                mat[i][j]=mat[i][j] + Math.min(mat[i-1][j], mat[i][j-1]);
            }
        }

        System.out.println(mat[row-1][col-1]);

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(mat[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
