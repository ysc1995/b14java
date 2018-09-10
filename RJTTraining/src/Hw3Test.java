import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Hw3Test {
	
	@Test
	public void binaryTest(){
		int[] a = new int[10];
		a[0]=3;
		a[1]=6;
		a[2]=9;
		a[3]=14;
		a[5]=22;
		a[4]=19;
		a[6]=30;
		a[7]=33;
		a[8]=46;
		a[9]=50;
		
		String result = Hw3.sumEqual(a, 31);
		
		assertEquals("9+22=31", result);

	}
	
	@Test
	public void commonElementsTest(){
		int[] b = new int[5];
		int[] c = new int[5];
		b[0]=12;
		b[1]=23;
		b[2]=41;
		b[3]=1;
		b[4]=7;
		c[0]=3;
		c[1]=34;
		c[2]=41;
		c[3]=8;
		c[4]=90;
		int result = Hw3.commonElements(b, c);
		
		assertEquals(41, result);

	}


}
