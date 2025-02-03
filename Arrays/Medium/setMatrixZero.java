import java.util.ArrayList;
import java.util.Arrays;

public class setMatrixZero {

    //----------------optimized----------------//
    //create extra two arrays to keep a track of zeroes
    //create row matrix of m size and row matrix of n size
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }

    

    //----------------better----------------//
    static void setZero2(int[][] matrix){
        //set -1 row and cols
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==0){
                    setRowMinusOne(i, j, matrix);
                    setColMinusOne(i, j, matrix);           
                   }
                }
            }
        
        //set zero in place of -1
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

        //print matrix
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
               System.out.print(matrix[i][j] + " ");              
            }
            System.out.println();
        }
    }

    static void setRowMinusOne(int i, int j, int[][] matrix){
        for(int k=0 ; k<i ; k++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    static void setColMinusOne(int i, int j, int[][] matrix){
        for(int k=0 ; k<j ; k++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    

    //----------------selftested----------------//
    static void setZero1(int[][] matrix){
        int[][] tempMatrix = new int[matrix.length][matrix[0].length];
        //copy matrix to temp matrix
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                tempMatrix[i][j] = matrix[i][j];            
            }
        }

        //set zero row and cols
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(tempMatrix[i][j]==0){
                    setRowColumnZero(i, j, matrix);              }
            }
        }

        //print matrix
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
               System.out.print(matrix[i][j] + " ");              
            }
            System.out.println();
        }
    }

    //method to set zero specific row and column
    static void setRowColumnZero(int i, int j, int[][] matrix){
        for(int k=0 ; k<matrix.length ; k++){
            for(int l=0 ; l<matrix[k].length ; l++){
                if(k==i || l==j){
                    matrix[k][l]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setZero2(matrix1);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
