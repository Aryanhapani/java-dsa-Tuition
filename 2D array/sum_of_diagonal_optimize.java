public class sum_of_diagonal_optimize {
    public static void main(String[] args) {
          int[][]  mat={
            {5,8,4},
            {9,3,4},
            {2,7,6},
        };

        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            sum+=mat[i][i];
            if(mat[i][i]==mat[i][col-1-i]){
                continue;
            }
            sum+=mat[i][col-1-i];
        }
        System.out.println(sum);
    }
}
