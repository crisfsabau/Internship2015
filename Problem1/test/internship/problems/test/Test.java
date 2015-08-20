/**
 * 
 */
package internship.problems.test;

import static org.junit.Assert.assertEquals;

import problems.internship.StringAnagrams;

/**
 * @author cristina.sabau
 *
 */
public class Test {


	@org.junit.Test

	public void test1() {

		String word1 = "apple";
		String word2 = "pleap";
		StringAnagrams checker = new StringAnagrams();
		assertEquals(checker.areAnagrams(word1, word2), true);
	}

	@org.junit.Test
	public void test2() {
		String word1 = "lac";
		String word2 = "calp";
		StringAnagrams checker = new StringAnagrams();
		assertEquals(checker.areAnagrams(word1, word2), false);

	}

}
