package convertRomanos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ConvertTest {
	
	@Test
	void testM() {
		String result = Convert.convertRomanos(1000);
		Assert.assertEquals("M", result);
	}
	
	@Test
	void testCM() {
		String result = Convert.convertRomanos(900);
		Assert.assertEquals("CM", result);
	}
	
	@Test
	void testD() {
		String result = Convert.convertRomanos(500);
		Assert.assertEquals("D", result);
	}
	
	@Test
	void testCD() {
		String result = Convert.convertRomanos(400);
		Assert.assertEquals("CD", result);
	}
	
	@Test
	void testC() {
		String result = Convert.convertRomanos(100);
		Assert.assertEquals("C", result);
	}
	
	@Test
	void testXC() {
		String result = Convert.convertRomanos(90);
		Assert.assertEquals("XC", result);
	}
	
	@Test
	void testL() {
		String result = Convert.convertRomanos(50);
		Assert.assertEquals("L", result);
	}
	
	@Test
	void testXL() {
		String result = Convert.convertRomanos(40);
		Assert.assertEquals("XL", result);
	}
	
	@Test
	void testX() {
		String result = Convert.convertRomanos(10);
		Assert.assertEquals("X", result);
	}
	
	@Test
	void testIX() {
		String result = Convert.convertRomanos(9);
		Assert.assertEquals("IX", result);
	}
	
	@Test
	void testV() {
		String result = Convert.convertRomanos(5);
		Assert.assertEquals("V", result);
	}
	
	@Test
	void testIV() {
		String result = Convert.convertRomanos(4);
		Assert.assertEquals("IV", result);
	}
	
	@Test
	void testI() {
		String result = Convert.convertRomanos(1);
		Assert.assertEquals("I", result);
	}
	
	@Test
	void testZero() {
		String result = Convert.convertRomanos(00);
		Assert.assertEquals("", result);
	}
	
	@Test
	void test2751() {
		String result = Convert.convertRomanos(2751);
		Assert.assertEquals("MMDCCLI", result);
	}
		
	@Test
	void testNegativo() {
		String result = Convert.convertRomanos(-1210);
		Assert.assertEquals("Número inválido. Por favor informe um número entre 1 (zero) e 3999.", result);
	}
	
	@Test
	void test4000() {
		String result = Convert.convertRomanos(4000);
		Assert.assertEquals("Número inválido. Por favor informe um número entre 1 (zero) e 3999.", result);
	}
	
	@Test
	void testLimiteMax() {
		String result = Convert.convertRomanos(3999);
		Assert.assertEquals("MMMCMXCIX", result);
	}
	
}
