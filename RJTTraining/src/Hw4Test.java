import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;



public class Hw4Test {
	
	@Test
	public void findSecondLargetestTest(){
		int[] a ={1,3,5,2,7,4,9,6};
		
		int result = Hw4.findSecondLargetest(a);
		
		assertEquals(7, result);

	}

}
