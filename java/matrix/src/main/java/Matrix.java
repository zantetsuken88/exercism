class Matrix {

    private String matrixAsString;

    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        String[] rows = matrixAsString.split("[\\n]+");
        String selectRow = rows[rowNumber];
        String[] ints = selectRow.split("\\s");
        int[] result = new int[ints.length];
        for ( int i=0; i < ints.length; i++) {
            result[i]=Integer.valueOf(ints[i]);
        }
        return result;
        }

    int[] getColumn(int columnNumber) {
        String[] rows = matrixAsString.split("[\\n]+");
        int[] result = new int[rows.length];
        for (int i=0; i < rows.length; i++) {
            String[] selectRow = rows[i].split("\\s");
            result[i]= Integer.valueOf(selectRow[columnNumber]);
        }
        return result;
    }
}
