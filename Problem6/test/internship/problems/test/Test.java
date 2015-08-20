/**
 * 
 */
package internship.problems.test;

import static org.junit.Assert.assertEquals;

import problems.internship.ArabicToRoman;

/**
 * @author cristina.sabau
 *
 */
public class Test {

	@org.junit.Test
	public void test1() {
		ArabicToRoman arabicToRoman = new ArabicToRoman();
		int numberArabic = 20;
		assertEquals(arabicToRoman.toArabic(numberArabic), "XX");
	}

	@org.junit.Test
	public void test2() {
		ArabicToRoman arabicToRoman = new ArabicToRoman();
		int numberArabic = 456;
		assertEquals(arabicToRoman.toArabic(numberArabic), "CDLVI");
	}

	@org.junit.Test
	public void test3() {
		ArabicToRoman arabicToRoman = new ArabicToRoman();
		int numberArabic = 9899;
		assertEquals(arabicToRoman.toArabic(numberArabic), "MMMMMMMMMDCCCXCIX");
	}

}
