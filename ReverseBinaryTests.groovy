import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


class ReverseBinaryTests {
	

	@Test(expected=IllegalArgumentException.class)
	public void testNumberNotNull() {
		ReverseBinary.reverseNumber(null);
	}
	
	@Test
	public void testCorrectReverseNumberOne() {
		int result = ReverseBinary.reverseNumber(1);
		assertEquals(1, result);
	}
	
	@Test
	public void testCorrectReverseNumberTwo() {
		int result = ReverseBinary.reverseNumber(2);
		assertEquals(1, result);
	}
	
	@Test
	public void testCorrectReverseNumberThree() {
		int result = ReverseBinary.reverseNumber(3);
		assertEquals(3, result);
	}
	
	@Test
	public void testCorrectReverseNumberThirteen() {
		int result = ReverseBinary.reverseNumber(13);
		assertEquals(11, result);
	}
	
	@Test
	public void testCorrectReverseNumberFortySeven() {
		int result = ReverseBinary.reverseNumber(47);
		assertEquals(61, result);
	}

}
