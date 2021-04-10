/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testRoll() {
        int expected = 6;
        int actual = Library.roll(6).length;
        boolean checker = false;
        int array[] = Library.roll(6);
        for (int i = 0; i < Library.roll(6).length; i++) {
            if (array[i] >= 0 && array[i] <= 6) {
                checker = true;
            }
        }
        assertEquals(expected, actual);
        assertTrue(checker);
    }

    @Test
    public void testContainsDuplicates() {
        int array1[] = {1, 2, 3};
        int array2[] = {1, 1, 2, 3};
        boolean expectedTrue = Library.containsDuplicates(array2);
        boolean expectedFalse = Library.containsDuplicates(array1);
        assertTrue(expectedTrue);
        assertFalse(expectedFalse);
    }

    @Test
    public void testCalculatingAverages() {
        int array[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int expected = 14;
        int real = Library.calculatingAverages(array);
        assertEquals(expected, real);
    }

    @Test
    public void testMatrixRowsAvg() {
        int[][] matrix = {
                {2, 2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4, 4, 4},
                {1, 1, 1, 1, 1, 1, 1},
        };
        int[] expected = Library.matrixRowsAvg(matrix);
        int[] actual = {1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(expected,actual);
    }

}