/**
 * 
 */
package problems.internship;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cristina.sabau
 *
 */
public class Test {

	public static void main (String[] args) throws FileNotFoundException{
		Scanner file = new Scanner(new FileReader("src/wordList.txt"));
		String wordFromFile;
		String inputWord = "documenting";
		ArrayList<String> wordsList = new ArrayList<String>();
		while (file.hasNext()) {
			wordFromFile = file.next();
			wordsList.add(wordFromFile); // adding to the array list
		}
		StringAnagrams checkAnagrams = new StringAnagrams();
		file.close();
		for (String word1 : wordsList) {
			for (String word2 : wordsList) {
				String word = word1 + word2;
				if (checkAnagrams.checkAnagram(inputWord, word) == true) {
					System.out.println(word1 + " " + word2);
				}

			 }
		
		
	}
	}
}
