package JavaTest2;

import java.util.HashMap;
import java.util.Map;

public class HashMapPr {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("테스트1", 1);
		map.put("테스트2", 2);
		map.put("테스트3", 3);

		System.out.println(map);

		System.out.println(map.keySet());

		System.out.println(map.get("테스트1"));
		System.out.println(map.get("테스트2"));
		System.out.println(map.get("테스트3"));
	}

}
