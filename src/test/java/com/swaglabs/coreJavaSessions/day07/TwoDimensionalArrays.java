package day07;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        //Declare and instantiation 2D array

        //combine declaration & instantiation in one line
        /**
         *          datatype [][] variable_name = new datatype[row size][column size];
         *          datatype [][] variable_name = {{1,2}, {3,4}, {5, 6}, {7,8}, {"Mobile", "Tablet"}};
         *
         */

        int[][] c;
        int d[][];

        int[][] g = new int[1][0];
        int h[][] = new int[1][0];
        int f[][] = new int[3][2];

        /**
         * Declaration & Instantiation
         * 1.  datatype [][] var_name;  int [][] a;
         * 2.  datatype var_name [][];  int a [][];
         *
         */

        int[][] a = new int[3][2]; // 3 rows and 2 columns

        String[][] devices = new String[3][3];
        devices[0][0] = "Mobile";


        //Insert values in an array
        //a [rows] [columns]

        a[0][0] = 12; //row =0, col = 0
        a[0][1] = 13; //row=0, col = 1
        a[1][0] = 14; //row =1, col=0
        a[1][1] = 15; //row = 1, col = 1
        a[2][0] = 16; //row=2, col=0
        a[2][1] = 17; //row = 2, col=1

//        int [][] b = {{12,13}, {14,15}, {16,17}};

        /**
         * Print size of rows and columns
         */
        System.out.println("No.of rows available : " + a.length);
        System.out.println("No.of columns available :" + a[0].length);

        /**
         * Read values from an array using outer and inner for loop
         *
         */
        for (int i = 0; i < a.length; i++) {        //rows
            for (int j = 0; j < a[0].length; j++) { //columns
                System.out.println(a[i][j]);    //0=value,0=val
            }
        }

        /**
         * // Use a for-each loop to iterate over the rows of the array
         * for (int[] row : array) {
         * // Use another for-each loop to iterate over the elements of each row
         * for (int element : row) {
         * // Print the element followed by a space
         * System.out.print(element + " ");
         * }
          */

        for(int[] i : a) {
            for (int j : i) {
                System.out.println(j + "");
            }
        }
    }
}
