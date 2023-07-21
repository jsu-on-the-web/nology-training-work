package testing;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

// Gonna have to run these tests in Eclipse...

public class UtilsTest {
    @Test
    public void add_TwoPositiveIntegers_ReturnCorrectSum() {
        int expectedResult = 4;
        int actualResult = Utils.add(2, 2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_TwoNegativeIntegers_ReturnCorrectSum() {
        int expectedResult = -4;
        int actualResult = Utils.add(-2, -2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divide_TwoPositiveIntegers_ReturnCorrectDivision() {
        double expectedResult = 2.0;
        double actualResult = Utils.divide(4.0, 2.0);
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void divide_DivisorIsZero_ThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> Utils.divide(4.0, 0.0));
    }

    @Test 
    public void unique_InputArrayHadDuplicates_ReturnsUniqueValues() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,3));
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList( 1, 2, 3));
        ArrayList<Integer> actualResult = Utils.unique(input);
        assertEquals(expectedResult, actualResult);
    }

    	// check if a list with no unique elements returs a list of the same size
        @Test
        public void unique_InputArrayHadNoDuplicates_ReturnsUniqueValues() {
            ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3));
            ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList( 1, 2, 3));
            ArrayList<Integer> actualResult = Utils.unique(input);
            assertEquals(expectedResult, actualResult);
        }
	
        // If a list has no elements at all, it should return an empty list
        @Test
        public void unique_EmptyList_ReturnsEmptyList() {
            ArrayList<Integer> input = new ArrayList<Integer>();
            ArrayList<Integer> expectedResult = new ArrayList<Integer>();
            ArrayList<Integer> actualResult = Utils.unique(input);
            assertEquals(expectedResult, actualResult);
        }
}
