public class sum_of_diagonal_element {
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
            for(int j=0;j<col;j++){
                if(i==j || i+j==col-1){
                    sum+=mat[i][j];
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
        System.out.println(sum);
    }
    
}
