package p2023_08_01;

import java.util.Iterator;
import java.util.TreeSet;

public class Homework {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		for (int i = 0; ts.size() < 6 ; i++) {
			int random = (int) (Math.random() * 45) + 1;
			ts.add(random);
		}
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
