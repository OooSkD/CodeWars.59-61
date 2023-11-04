package test;

import main.Matrix;
import main.NumberUtils;
import main.WeightSort;
import org.junit.Test;

import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class Tasks_Tests {
    private static int[][][] matrix = { {{1}},
            {{1, 3}, {2,5}},
            {{2,5,3}, {1,-2,-1}, {1, 3, 4}}};

    private static int[] expected = {1, -1, -20};

    private static String[] msg = {"Determinant of a 1 x 1 matrix yields the value of the one element",
            "Should return 1 * 5 - 3 * 2 == -1 ",
            ""};

    @Test
    public void Matrix_Tests() {
        for (int n = 0 ; n < expected.length ; n++)
            assertEquals(msg[n], expected[n], Matrix.determinant(matrix[n]));
    }

    @Test
    public void NumberUtils_Tests() {
        assertTrue("153 is narcissistic",NumberUtils.isNarcissistic(153) );
        assertTrue("1634 is narcissistic", NumberUtils.isNarcissistic(1634));
        assertFalse("112 is not narcissistic", NumberUtils.isNarcissistic(112) );
    }

    @Test
    public void WeightSort_Tests() {
        assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
