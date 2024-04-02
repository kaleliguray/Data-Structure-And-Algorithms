package src;

/**
 * @author giraykaleli
 *
 * In this part, we will try to find a match between our value and one of the matrix's element
 *
 */

public class SortedMatrix {

    /**
     *
     * @param matrix --> we will search the value (x) by traveling between row and column
     * @param n is the row&column number of the matrix - matrix length
     * @param x is the value which we will check whether there is a match in the specified matrix index [i][j]
     */
    public void search(int[][] matrix, int n, int x){

        int i = 0;
        int j = n - 1;

        while ( i < n && j >= 0){

            if (matrix[i][j] == x){
                System.out.println(x + " - our value is founded at - " + i + ".row , " + j + ".column");
                return;
            }

            if (matrix[i][j] > x){
                // we start to check column from left(last) to right(first)
                j--; // in here, we will reduce the column number & next to left colum (not right)

            }else {
                // we start to check row from up(first) to down(last)
                i++; // in here, we will increase the row number & down to next row (not above)
            }
        }
        System.out.println(x + " - Value not found!");
    }

    public static void main(String[] args) {

        int[][] matrix = {
                            {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 51}
                         };

        SortedMatrix sm = new SortedMatrix();
        sm.search(matrix, matrix.length,32);
        sm.search(matrix, matrix.length,88);





    }


}
