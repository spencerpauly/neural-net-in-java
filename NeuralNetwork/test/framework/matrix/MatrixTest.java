/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.matrix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spencer
 */
public class MatrixTest {
    
    private final double[][] matrix3x3 = { {1.0, 2.0, 3.0},
                                         {4.0, 5.0, 6.0},
                                         {7.0, 8.0, 9.0} };
    
    private final double[][] matrixIdentity = { {1,0,0},
                                                {0,1,0},
                                                {0,0,1} };
    
    private final double[][] matrix3x1 = { {1},
                                           {2},
                                           {3} };
    
    private final double[][] matrix1x3 = { {1,2,3} };

    Matrix m3x3, mIdentity, m3x1, m1x3;
    
    
    public MatrixTest() {
        m3x3 = new Matrix(matrix3x3);
        mIdentity = new Matrix(matrixIdentity);
        m3x1 = new Matrix(matrix3x1);
        m1x3 = new Matrix(matrix1x3);
    }
    
    @Test
    public void testToString() {
        System.out.println(m3x3.toString());
        assertTrue(m3x3.toString().equals(
                "[ 1.0 , 2.0 , 3.0 ]\n" +
                "[ 4.0 , 5.0 , 6.0 ]\n" +
                "[ 7.0 , 8.0 , 9.0 ]\n" ));
        
        System.out.println(mIdentity.toString());
        assertTrue(mIdentity.toString().equals(
                "[ 1.0 , 0.0 , 0.0 ]\n" +
                "[ 0.0 , 1.0 , 0.0 ]\n" +
                "[ 0.0 , 0.0 , 1.0 ]\n" ));
        
        System.out.println(m3x1.toString());
        assertTrue(m3x1.toString().equals(
                "[ 1.0 ]\n" +
                "[ 2.0 ]\n" +
                "[ 3.0 ]\n" ));

        System.out.println(m1x3.toString());
        assertTrue(m1x3.toString().equals(
                "[ 1.0 , 2.0 , 3.0 ]\n" ));
    }
    
    @Test
    public void testMatrixAddition() {
        
    }
    
}
    
