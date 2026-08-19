public class print_digonal {
 public static void main(String[] args) {
     int[][]  mat={
            {5,8,4},
            {9,3,4},
            {2,7,6},
        };

        int row=mat.length;
        int col=mat[0].length;
     

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
 }   
}
