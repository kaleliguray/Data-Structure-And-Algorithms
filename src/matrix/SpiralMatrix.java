package src.matrix;

/**
 * @author giraykaleli
 */

public class SpiralMatrix {

    /**
     * @return the method spiralPrint() returns the values inside the matrix as spiral way - left to right, up to down, right to left, down to up
     * @param matrix --> we will search the value (x) by traveling between row and column
     * @param r is the row of the matrix
     * @param c is column number of the matrix
     *  k is equal the row - r --> we will decrease it to up to down in the row
     *  l is equal the colum - c ---> we will increase it to left to right in the column
     */

    public void spiralPrint(int[][] matrix, int r, int c){
        int i, k=0, l=0;

        while ( k < r && l < c){

            // left ---> right
            for (i = l; i < c; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++; // go down one row to go to up row to down

            // up ---> down
            for (i = k; i < r; i++){
                System.out.print(matrix[i][c-1] + " ");
            }
            c--; // decrease column size to go to right column to left
            
            if(k<r){

                // right ---> left
                for ( i = c-1; i >= l; i--){
                    System.out.print(matrix[r-1][i] + " ");
                }
                r--; // decrease row size to go to down row to up
            }

            if (l<c){

                // down ---> up
                for ( i = r-1; i >= k; i--){
                    System.out.print(matrix[i][l] + " ");
                }
                l++; // increase column to go to left to right
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        SpiralMatrix spiral = new SpiralMatrix();

        spiral.spiralPrint(matrix, matrix.length, 4);



    }









}
