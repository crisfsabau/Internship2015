/**
 * 
 */
package problems.internship;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cristina.sabau
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		SecretSanta santaPeople = new SecretSanta();
		ArrayList<String> people = new ArrayList<String>();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		FileInputStream fis = new FileInputStream("src/people.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			people.add(line);
		}
		br.close();
		for (String person : people) {
			System.out.println(person);
		}
		hashMap = santaPeople.chooseSanta(people);
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}


}
