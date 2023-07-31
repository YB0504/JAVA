package p2023_7_31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Collections01 {
	public static void main(String[] args) {
		
//		set은 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
//		set s = new Set();	오류 발생
		
		Set set = new HashSet();	// 업캐스팅
//	HashSet	set = new HashSet();	// 하위 상속을 받는 클래스 만으로 객체 생성
		System.out.println("요소의 갯수->" + set.size());	// 0
		
//		boolean add(Object e)
		set.add("하나");			// 업캐스팅
		set.add(2);
		set.add(3.42);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);				
		
		// 중복된 데이터를 저장할 수 없다.
		System.out.println("요소의 갯수->" + set.size());	// 6
		
		// 가장 간단한 출력 방법
		System.out.println(set);

//		Iterator(반복자) : 2, 6, 넷, 하나, 3.42, five
		Iterator elements = set.iterator();
		while (elements.hasNext()) {	// 가져올 데이터가 있을 때 true값을 리턴
			System.out.println("\t\t" + elements.next());
			//	next() : 데이터를 가져오는 역할
		}

		/*
		 * Vector에만 적용 
		 * Enumeration enu = set.elements(); 
		 * while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}
