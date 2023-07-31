package p2023_7_31;

import java.util.ArrayList;
import java.util.List;

class Collections02 {

	public static void main(String[] args) {
		
//		인터페이스이기 때문에 자체 객체 생성 불가
//		List li = new List();
		
		List list = new ArrayList();		// 업캐스팅
//		ArrayList list = new ArrayList();
		
//		boolean add(Object e)
		list.add("하나");					// 업캐스팅
		list.add(2);
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		// 데이터를 순서대로 출력
		System.out.println(list); // [하나, 2, 2, 3.42, 넷, five, 6]

	}
}
