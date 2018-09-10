
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * test fibonacci();
		prime();
		palindrome();
		factorial(5);
		armstrong();
		
 * @author Shaocheng Yang
 *
 */
public class Hw1Test {
	
	@Test
	public void armstrongTest(){
		
		int[] expectedResult = {0, 1 ,2 ,3 ,4, 5, 6, 7, 8 ,9 ,153, 370, 371 ,407};
		int[] result = Hw1.armstrong();
		assertArrayEquals(expectedResult, result);
		
	}
	
	@Test
	public void primeTest(){
		Hw1.prime();
		
	}
	
	@Test
	public void palindromeTest(){
		Hw1.palindrome();
		
	}
	
	@Test
	public void factorialTest(){
		int expectedResult = 120;
		int result = Hw1.factorial(5);
		assertEquals(expectedResult, result);
		
		
	}
	
	@Test
	public void fibonacciTest(){
		Hw1.fibonacci();
		
	}

}
