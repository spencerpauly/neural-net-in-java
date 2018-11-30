/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.matrix;

/**
 *
 * @author Spencer
 */
public class Matrix {
    
    private static final double E = 2.71828182845904523536;
    private int rows;
    private int columns;
    
    private final double[][] data;
    
        
        //Main functions
        public Matrix() {
            this.rows = 0;
            this.columns = 0;
            
            data = new double[0][0];
        }
        
        public Matrix(int rowCount, int columnCount) {
            this.rows = rowCount;
            this.columns = columnCount;
            
            data = new double[rows][columns];
        }
        
        public Matrix(Matrix other) {
            this.rows = other.getRows();
            this.columns = other.getColumns();
            
            data = other.getData();
        }
        
        public Matrix(double[][] other) {
            this.rows = other.length;
            this.columns = other[0].length;
            
            data = other;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            
            for (int r = 0; r < rows; r++) {
                builder.append("[ ");
                for (int c = 0; c < columns; c++) {
                    builder.append(data[r][c]);
                    builder.append(" ");
                    if (c == columns-1)
                        builder.append("]");
                    else
                        builder.append(", ");                  
                }
                builder.append("\n");
            }
            return builder.toString();

        }
        
        public double[][] getData() {
            return data;
        }
        
        public void setValue(int row, int column, double newValue) {
            data[row][column] = newValue;
        }

        public void setRows(int rows) {
            this.rows = rows;
        }
        
        public void setColumns(int columns) {
            this.columns = columns;
        }
        
        public int getRows() {
            return rows;
        }
        
        public int getColumns() {
            return columns;
        }

        public double getValue(int row, int column) {
            return data[row][column];
        }
 
        private boolean canAdd(Matrix other) throws Exception {
            if (rows != other.getRows() || columns != other.getColumns() ) {
                String message = "Matrix class overloaded "
                    + "'+' operator called with invalid Matrices. ";
                throw new Exception(message);
            }
            return true;
        }
        
        private boolean canSubtract(Matrix other) throws Exception {
            if (rows != other.getRows() || columns != other.getColumns() ) {
                String message = "Matrix class overloaded "
                    + "'-' operator called with invalid Matrices. ";
                throw new Exception(message);
            }
            return true;
        }
        
        private boolean canMult(Matrix other) throws Exception {
            if (rows != other.getRows() || columns != other.getColumns() ) {
                String message = "Matrix class overloaded "
                    + "'*' operator called with invalid Matrices of size: "
                    + rows
                    + "x"
                    + columns
                    + " & "
                    + other.getRows()
                    + "x"
                    + other.getColumns();

                throw new Exception(message);
            }

            return true;
        
        }
        
        private boolean canDot(Matrix other) throws Exception {
            if (columns != other.getRows() ) {
                String message = "Matrix class overloaded "
                    + "dot product operator called with invalid Matrices of size: "
                    + rows
                    + "x"
                    + columns
                    + " & "
                    + other.getRows()
                    + "x"
                    + other.getColumns();

                throw new Exception(message);
            }

            return true;
            
        }
               
}