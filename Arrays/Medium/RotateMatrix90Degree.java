public class RotateMatrix90Degree {

    //optimized appraoch
    static void rotateMatrix2(int[][] matrix) {

        // transpose the matrix
        // swap first col with row elements, second with second and so on..

        for (int a = 0; a < matrix.length; a++) {
            for (int b = a; b < matrix[a].length; b++) {
                int temp = matrix[a][b];
                matrix[a][b] = matrix[b][a];
                matrix[b][a] = temp;
            }
        }

        printArr(matrix);

        // reverse each 
       
        for(int k=0 ; k<matrix.length ; k++){
            int left=0 ; 
            int right=matrix[left].length-1;
            while(left<right){
                //swap
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;
                left++;
                right--;
            }
        }
        printArr(matrix);
        

    }

    //print matrix
    static void printArr(int[][] matrix) {
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }

    // selftested (using extra matrix)
    static void rotateMatrix1(int[][] matrix) {
        // copy
        int[][] copyMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                copyMatrix[i][j] = matrix[j][i];
            }
        }
        // traverse and swap elements opposite index
        int i, j;
        for (int k = 0; k < matrix.length; k++) {
            i = 0;
            j = matrix.length - 1;
            while (i < j) {
                int temp = copyMatrix[k][i];
                copyMatrix[k][i] = copyMatrix[k][j];
                copyMatrix[k][j] = temp;
                i++;
                j--;
            }
        }

        // print matrix
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                System.out.print(copyMatrix[a][b] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotateMatrix2(matrix);
    }
}
