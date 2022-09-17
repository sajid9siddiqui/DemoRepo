package Demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class intefviewClass {

	public static void main(String[] args) {
		String str = "java is a programing language";
		String[] strAr = str.split("");

		HashMap<String, Integer> mapA = new HashMap<String, Integer>();

		for (int i = 0; i < strAr.length; i++) {
			if (mapA.containsKey(strAr[i])) {

				Integer q = mapA.get(strAr[i]) + 1;
				mapA.put(strAr[i], q);

			} else {
				mapA.put(strAr[i], 1);
			}
		}

		System.out.println(mapA);

		for(Map.Entry<String, Integer> entry: mapA.entrySet()) {
			System.out.println("Char :"+entry.getKey()+" And Accurance is: "+entry.getValue());
		}
		
		numberOfWord();
	}

	static void numberOfWord() {
		String str = "  java     is a  programing   language ";
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (i > 0 && str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
