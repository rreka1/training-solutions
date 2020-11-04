package arrayofarrays;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size) {

        int[][] table = new int[size][size];

        for(int i = 0; i < table.length; i++) {

            for(int j = 0; j < table[i].length; j++) {

                table[i][j] = (i+1) * (j+1);
            }
        }

        return table;
    }

    public void printArrayOfArrays(int[][] a) {

        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < a[i].length; j++) {

                if(a[i][j] < 10) {

                    System.out.print("  " + a[i][j]);
                } else {

                    System.out.print(" " + a[i][j]);
                }
            }

            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size) {

        int[][] matrix = new int[size][];

        for(int i = 0; i < matrix.length; i++) {

            matrix[i] = new int[i + 1];

            for(int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = i;
            }
        }

        return matrix;
    }

    //...
    public int[][] getValues() {

        int[][] array = new int[12][];

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < days.length; i++) {

            array[i] = new int[days[i]];
        }

        return array;
    }



    public static void main(String[] args) {

        ArrayOfArraysMain arrays = new ArrayOfArraysMain();

        System.out.println("\nSzorzoóótábla: ");
        arrays.printArrayOfArrays(arrays.multiplicationTable(4));
        System.out.println();
        arrays.printArrayOfArrays(arrays.multiplicationTable(8));

        System.out.println("\nHáromszögmátrix: ");
        arrays.printArrayOfArrays(arrays.triangularMatrix(4));

        System.out.println("\nNapi mért értékek: ");
        arrays.printArrayOfArrays(arrays.getValues());

    }
}
