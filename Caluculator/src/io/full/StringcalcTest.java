package io.full;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringcalcTest {
	
	@Test
	public void test2() {
		
		StringCalc.add("2,3");
	}
	
	@Test
	public void test1() {
		StringCalc.add("2");
	}
	
	@Test
	public void test0() {
		StringCalc.add("");
	}
	
	
	@Test
	public void testemptystring() {
		int actual=StringCalc.add("");
		
		Assert.assertEquals(0,actual);
		
		
	}
	
	@Test
	public void test2number() {
		int actual=StringCalc.add("3,7");
		
		Assert.assertEquals(10,actual);
		
		
	}
	
	@Test
	public void test3number() {
		int actual=StringCalc.add("5,7");
		
		Assert.assertEquals(12,actual);
		
		
	}
	
	
	@Test
	public void testunlimitednumbe3r() {
		int actual=StringCalc.add("3,6,9");
		
		Assert.assertEquals(18,actual);
		
		
	}
	
	
	@Test
	public void testunlimitednumbetest() {
		int actual=StringCalc.add("//Hn4H3H97");
		
		Assert.assertEquals(23,actual);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	//@Test
//	public void testunlimitednumbe4r() {
//		int actual=StringCalc.add("3,6,9,1,,1,");
//		
//		//Assert.assertEquals(20,actual);
//		Assertions.assertThrows(NumberFormatException.class, () -> StringCalc.add("+,360,9,,3"));
//	}
	
	
	
	

}
