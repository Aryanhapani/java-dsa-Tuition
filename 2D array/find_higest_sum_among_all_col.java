public class find_higest_sum_among_all_col {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };


        int row=mat.length;
        int col=mat[0].length;
       
        int max=Integer.MIN_VALUE;
        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
              sum+=mat[i][j];
            }
            if(max < sum){
                max=sum;
            }
        }

        System.out.println(max);
    }
}
