package JavaTest2;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		
		int Lotto;
		
		TreeSet s = new TreeSet();
		
		Random r = new Random();
		
		while(true) {
			Lotto = r.nextInt(45) + 1;
			s.add(Lotto);
			if(s.size() == 6) {
				System.out.println(s);
				break;
			}
		}
		

	}

}
