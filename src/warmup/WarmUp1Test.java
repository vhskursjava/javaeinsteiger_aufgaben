package warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class WarmUp1Test {

	@Test
	public void greaterThan100Test() {
		assertEquals(true, WarmUp1.greaterThan100(101));
		assertEquals(false, WarmUp1.greaterThan100(100));
		assertEquals(false, WarmUp1.greaterThan100(99));
		assertEquals(true, WarmUp1.greaterThan100(1000));
		assertEquals(false, WarmUp1.greaterThan100(-99));
		assertEquals(false, WarmUp1.greaterThan100(-101));
	}
	
	@Test
	public void isEvenTest() {
		assertEquals(true, WarmUp1.isEven(0));
		assertEquals(true, WarmUp1.isEven(2));
		assertEquals(true, WarmUp1.isEven(100));
		assertEquals(true, WarmUp1.isEven(56));
		assertEquals(false, WarmUp1.isEven(1));
		assertEquals(false, WarmUp1.isEven(5));
		assertEquals(false, WarmUp1.isEven(113));
		assertEquals(false, WarmUp1.isEven(57));
		assertEquals(true, WarmUp1.isEven(-4));
		assertEquals(false, WarmUp1.isEven(-7));
	}
	
	@Test
	public void sleepInTest() {
		assertEquals(true, WarmUp1.sleepIn(false, false));
		assertEquals(true, WarmUp1.sleepIn(false, true));
		assertEquals(true, WarmUp1.sleepIn(true, true));
		assertEquals(false, WarmUp1.sleepIn(true, false));
	}

	@Test
	public void monkeyTroubleTest() {
		assertEquals(true, WarmUp1.monkeyTrouble(true, true));
		assertEquals(true, WarmUp1.monkeyTrouble(false, false));
		assertEquals(false, WarmUp1.monkeyTrouble(true, false));
		assertEquals(false, WarmUp1.monkeyTrouble(false, true));
	}

	@Test
	public void sumDoubleTest() {
		assertEquals(3, WarmUp1.sumDouble(1, 2));
		assertEquals(5, WarmUp1.sumDouble(3, 2));
		assertEquals(8, WarmUp1.sumDouble(2, 2));
		assertEquals(-1, WarmUp1.sumDouble(-1, 0));
		assertEquals(12, WarmUp1.sumDouble(3, 3));
		assertEquals(0, WarmUp1.sumDouble(0, 0));
		assertEquals(1, WarmUp1.sumDouble(0, 1));
		assertEquals(7, WarmUp1.sumDouble(3, 4));
	}

	@Test
	public void diff21Test() {
		assertEquals(2, WarmUp1.diff21(19));
		assertEquals(11, WarmUp1.diff21(10));
		assertEquals(0, WarmUp1.diff21(21));
		assertEquals(2, WarmUp1.diff21(22));
		assertEquals(8, WarmUp1.diff21(25));
		assertEquals(18, WarmUp1.diff21(30));
		assertEquals(21, WarmUp1.diff21(0));
		assertEquals(20, WarmUp1.diff21(1));
		assertEquals(19, WarmUp1.diff21(2));
		assertEquals(22, WarmUp1.diff21(-1));
		assertEquals(23, WarmUp1.diff21(-2));
		assertEquals(58, WarmUp1.diff21(50));
	}
	
	@Test
	public void parrotTroubleTest() {
		assertEquals(true, WarmUp1.parrotTrouble(true, 6));
		assertEquals(false, WarmUp1.parrotTrouble(true, 7));
		assertEquals(false, WarmUp1.parrotTrouble(false, 6));
		assertEquals(true, WarmUp1.parrotTrouble(true, 21));
		assertEquals(false, WarmUp1.parrotTrouble(false, 21));
		assertEquals(false, WarmUp1.parrotTrouble(false, 20));
		assertEquals(true, WarmUp1.parrotTrouble(true, 23));
		assertEquals(false, WarmUp1.parrotTrouble(false, 23));
		assertEquals(false, WarmUp1.parrotTrouble(true, 20));
		assertEquals(false, WarmUp1.parrotTrouble(false, 12));
	}
	
	@Test
	public void makes10Test() {
		assertEquals(true, WarmUp1.makes10(9,  10));
		assertEquals(false, WarmUp1.makes10(9,  9));
		assertEquals(true, WarmUp1.makes10(1,  9));
		assertEquals(true, WarmUp1.makes10(10,  1));
		assertEquals(true, WarmUp1.makes10(10,  10));
		assertEquals(true, WarmUp1.makes10(8,  2));
		assertEquals(false, WarmUp1.makes10(8,  3));
		assertEquals(true, WarmUp1.makes10(10,  42));
		assertEquals(true, WarmUp1.makes10(12,  -2));
	}
	
	@Test
	public void nearHundred() {
		assertEquals(true, WarmUp1.nearHundred(93));
		assertEquals(true, WarmUp1.nearHundred(90));
		assertEquals(false, WarmUp1.nearHundred(89));
		assertEquals(true, WarmUp1.nearHundred(110));
		assertEquals(false, WarmUp1.nearHundred(111));
		assertEquals(false, WarmUp1.nearHundred(121));
		assertEquals(false, WarmUp1.nearHundred(-101));
		assertEquals(false, WarmUp1.nearHundred(-209));
		assertEquals(true, WarmUp1.nearHundred(190));
		assertEquals(true, WarmUp1.nearHundred(209));
		assertEquals(false, WarmUp1.nearHundred(0));
		assertEquals(false, WarmUp1.nearHundred(5));
		assertEquals(false, WarmUp1.nearHundred(-50));
		assertEquals(true, WarmUp1.nearHundred(191));
		assertEquals(false, WarmUp1.nearHundred(189));
		assertEquals(true, WarmUp1.nearHundred(200));
		assertEquals(true, WarmUp1.nearHundred(210));
		assertEquals(false, WarmUp1.nearHundred(211));
		assertEquals(false, WarmUp1.nearHundred(290));
	}
	
	@Test
	public void posNegTest() {
		assertEquals(true, WarmUp1.posNeg(1, -1, false));
		assertEquals(true, WarmUp1.posNeg(-1, 1, false));
		assertEquals(true, WarmUp1.posNeg(-4, -5, true));
		assertEquals(false, WarmUp1.posNeg(-4, -5, false));
		assertEquals(true, WarmUp1.posNeg(-4, 5, false));
		assertEquals(false, WarmUp1.posNeg(-4, 5, true));
		assertEquals(false, WarmUp1.posNeg(1, 1, false));
		assertEquals(false, WarmUp1.posNeg(-1, -1, false));
		assertEquals(false, WarmUp1.posNeg(1, -1, true));
		assertEquals(false, WarmUp1.posNeg(-1, 1, true));
		assertEquals(false, WarmUp1.posNeg(1, 1, true));
		assertEquals(true, WarmUp1.posNeg(-1, -1, true));
		assertEquals(true, WarmUp1.posNeg(5, -5, false));
		assertEquals(true, WarmUp1.posNeg(-6, 6, false));
		assertEquals(false, WarmUp1.posNeg(-5, -6, false));
		assertEquals(false, WarmUp1.posNeg(-2, -1, false));
		assertEquals(false, WarmUp1.posNeg(1, 2, false));
		assertEquals(false, WarmUp1.posNeg(-5, 6, true));
		assertEquals(true, WarmUp1.posNeg(-5, -5, true));
	}
}
