public class sum_of_diagonal_optimize {
    public static void main(String[] args) {
          int[][]  mat={
           {4,6,7},
           {2,9,4},
           {5,5,5}
        };

        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            sum+=mat[i][i];
          
        if( i!=col-1-i){
          sum+=mat[i][col-1-i];
                   
        }
           
            
        }
        System.out.println(sum);
    }
}
