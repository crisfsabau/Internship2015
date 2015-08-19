package internship.problems;

import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class WordBreak {
	public static void main(String[] args) throws FileNotFoundException {
		String inputString = null;
		// reading a word
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the word: ");
		inputString = in.nextLine();
		System.out.println("You entered : " + inputString);

		// read the file and add words to an array , for processing
		Scanner file = new Scanner(new FileReader("src/dictionary.txt"));
		ArrayList<String> wordsResult = new ArrayList<String>();
		String wordFromFile;
		ArrayList<String> wordsList = new ArrayList<String>();
		while (file.hasNext()) {
			wordFromFile = file.next();
			wordsList.add(wordFromFile); // adding to the array list
		}
		file.close();

		for (int i = 0; i < inputString.length(); i++) {
			for (String word : wordsList) {
				for (int j = i + 1; j <= inputString.length(); j++) {
					if (inputString.substring(i, j).equals(word)) {
						wordsResult.add(word);
					}
				}
			}
		}

		for (String word : wordsResult) {
			System.out.println(word + " ");
		}
	}
}