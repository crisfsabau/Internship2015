/**
 * 
 */
package problems.internship;

import java.util.ArrayList;

/**
 * @author cristina.sabau
 *
 */
public class ArabicToRoman {

	public static String toArabic(int numberToConvert){
		String roman = "";
		int[]  arabicNumbers = { 1000,  900,  500,  400,  100,   90,  
                50,   40,   10,    9,    5,    4,    1 };
             
		String[] romanNumbers = { "M",  "CM",  "D",  "CD", "C",  "XC",
              "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
		for (int i = 0; i < arabicNumbers.length; i++) {
				while (numberToConvert >= arabicNumbers[i]) {
						roman += romanNumbers[i];
							numberToConvert-= arabicNumbers[i];
					}
		}
		return roman;
		
	}
	public static void main(String[] args){
		int num = 90;
		System.out.println("The arabic number is " + num);
		String roman = toArabic(num);
		System.out.println("The roman number is " + roman);
	}
}
