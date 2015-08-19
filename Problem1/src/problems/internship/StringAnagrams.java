/**
 * 
 */
package problems.internship;

import java.util.Arrays;

/**
 * @author cristina.sabau
 *
 */
public class StringAnagrams {

	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		// sorting the arrays
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		String newString1 = new String(string1);
		String newString2 = new String(string2);

		if (newString1.equals(newString2)) {
			return true;
		}

		return false;

	}

}
