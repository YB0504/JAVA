package p2023_8_01;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class HashTableTest {
	public static void main(String[] args) {

		// 1. 업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
		// 2. 업캐스팅이 되면 부모가 상속해준 메소드만 접근할 수 있다.
		// 3. keys() 메소드는 부모인 Map이 상속해준 메소드가 아니기 때문에
		// 업캐스팅으로 Map객체를 생성하면 사용할 수 없다.

//		Map ht = new Hashtable();			// 업캐스팅하면 안되는 경우
		Hashtable ht = new Hashtable();

//		put(Object key, Object value)
		ht.put("딸기", "StrawBerry"); 		// 업캐스팅
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");
		ht.put("conut", 10);

//	방법 1. key값을 알고 있는 경우
		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		// Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");	// 다운 캐스팅
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}

		// 다운 캐스팅
		String s = (String) ht.get("딸기");
		String s1 = (String) ht.get("사과");
		Integer s2 = (Integer) ht.get("count");
		
//		int i = s2.intValue(); // 언박싱
//		// 위의 두줄을 한줄로 ( 다운 캐스팅 + 언박싱 )
//		int ii = ((Integer) ht.get("count")).intValue();

//	방법 2. key값을 모르는 경우
//		열거형(Enumeration) : 딸기 사과 포도
		Enumeration Enum = ht.keys();	//Map의 모든 key값을 구해온다.
		while (Enum.hasMoreElements()) {	// key 값이 있을때만 true
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
