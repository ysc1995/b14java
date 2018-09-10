import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * testing Bubble Sort, Selection Sort, Insertion Sort, Linear Search, Binary Search
 * @param args
 */
public class Hw2Test {

	@Test
	public void binaryTest(){
		int[] arr = {4,6,2,8,1,0,9,7,5,3};
		int expectedResult = 4;
		int result = Hw2.binary(arr, 4);
		assertEquals(expectedResult, result);

	}

	@Test
	public void linearTest(){
		int[] arr = {4,6,2,8,1,0,9,7,5,3};
		int expectedResult = 3;
		int result = Hw2.linear(arr, 8);
		assertEquals(expectedResult, result);

	}
	
	@Test
	public void selectionTest(){
		int[] arr = {4,6,2,8,1,0,9,7,5,3};
		Hw2.selection(arr);
		

	}
	
}
