package java_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Set<String>> m = new HashMap<String, Set<String>>();

		String[] morning = { "GoodMorning", "Shubhodaya", "Shubhohday", "Bonjour" };
		String[] evening = { "good Evening", "Shubha sange", "susandhya", "Bonsoir" };

		Set<String> S1 = new HashSet<String>();
		Set<String> S2 = new HashSet<String>();

		Collections.addAll(S1, morning);
		Collections.addAll(S2, evening);

		m.put("GoodMorning", S1);
		m.put("GoodEvening", S2);

		Scanner txt = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Greeting");
		String str = txt.nextLine();

		if (m.containsKey(str)) {
			System.out.println(m.get(str));
		} else {

			System.out.println("Do you want to enter synonyms (y/n)");
			String str2 = txt.nextLine();
			Set<String> set = new HashSet<String>();
			;
			if (str2.contentEquals("y")) {
				String ans = "";
				do {
					ans = txt.nextLine();
					if (ans.length() > 0)
						set.add(ans);

				} while (ans.length() > 0);

			}

			m.put(str, set);
		}
		System.out.println(m);
	}

}
