/**
 * 
 */
package problems.internship;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cristina.sabau
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String word1 = "car";
		String word2 = "arcu";
		String word = "";
		StringAnagrams checker = new StringAnagrams();
		if(checker.checkAnagram(word1, word2)==true){
			System.out.println(word1 +" and " + word2 + " are anagrams");
		}
		else {
			System.out.println(word1 +" and " + word2 + " are not anagrams");
		}
		 Scanner file = new Scanner(new FileReader("src/words.txt"));
		 ArrayList<String> wordsList = new ArrayList<>();
		 while(file.hasNext()){
			 word = file.next();
			 wordsList.add(word);
		 }
		 file.close();
		 
		 for(int i = 0 ; i<wordsList.size(); i++){
			 for(int k = i+1 ; k<wordsList.size(); k++){
				 if(checker.checkAnagram(wordsList.get(i), wordsList.get(k))== true){
					 System.out.println(wordsList.get(i) + " and "+ wordsList.get(k) + " are anagrams");
				 		} else {
				 			//System.out.println(wordsList.get(i) + "and "+ wordsList.get(k) + " are not anagrams");
				 		}
			
		 }

	}

	}
}
