package p2023_08_02;

import java.util.Enumeration;
import java.util.Hashtable;

class HashTableTest02 {
	public static void main(String[] args) {

		// 제네릭을 설정해서 객체 생성
		// key, value값의 자료형이 String이기 때문에 String형만 저장 가능
		Hashtable<String, String> ht = new Hashtable<String, String>();

//		put(Object key, Object value)
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
//		ht.put("포도", 30);	// 오류 발생

		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
//	방법 1. key를 알고 있는 경우
		String Val = ht.get("포도");	// 다운 캐스팅 (자료형 생략)
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}

//	방법 2. key를 모르고 있는 경우
		// 열거형(Enumeration) : 사과 딸기 포도
		// 해쉬 테이블의 키 요소들에 대한 Enumeration 객체 반환
		Enumeration<String> Enum = ht.keys(); 
		while (Enum.hasMoreElements()) {	// key값이 있을 경우에만 true리턴
			String k = Enum.nextElement();
			String v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}