package problems.internship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SecretSanta {

	public HashMap<String, String> chooseSanta(ArrayList<String> people) {
		HashMap<String, String> santaPairs = new HashMap<String, String>();
		Random randomGenerator = new Random();

		int numberOfPeopleLeft = people.size();
		while (numberOfPeopleLeft != santaPairs.size()) {
			int index1 = randomGenerator.nextInt(numberOfPeopleLeft);
			int index2 = randomGenerator.nextInt(numberOfPeopleLeft);
			String person1 = people.get(index1);
			String person2 = people.get(index2);
			if (person1 != person2) {
				if (santaPairs.containsKey(person1) != true && (santaPairs.containsValue(person2) != true)) {
					santaPairs.put(person1, person2);
			}
		}
		}
		return santaPairs;

	}
}