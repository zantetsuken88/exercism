class Matrix {

    private String matrixAsString;

    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
       return convertToArray(matrixAsString)[rowNumber];
        }

    int[] getColumn(int columnNumber) {
      int[] column = new int[convertToArray(matrixAsString).length];
        for (int i = 0; i < column.length; i++) {
          column[i] = getRow(i)[columnNumber];
        }
        return column;
    }

    private int[][] convertToArray(String matrixAsString) {
      String[] rows = matrixAsString.split("[\\n]+");
      int[][] matrixArray = new int[rows.length][];

      for ( int i = 0; i < rows.length; i++) {
        String[] rowChars = rows[i].split("\\s");
        int[] row = new int[rowChars.length];
        for (int c = 0; c < row.length; c++) {
          row[c] = Integer.valueOf(rowChars[c]);
        }
        matrixArray[i] = row;
      }
      return matrixArray;
    }
}
