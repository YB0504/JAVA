package p2023_07_31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// p568 ~ 569
public class HashSetEx {

	public static void main(String[] args) {
		
		// 제네릭 : <> 안에 있는 특정 자료형만 들어갈 수 있게 지정한다.
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		// 반복자
		Iterator<String> iterator = set.iterator();
		// 객체의 데이터를 한번에 가져옴
		while(iterator.hasNext()) {
			String element = iterator.next();
			// 데이터를 한 개씩 가져옴
			System.out.println("\t" + element);
		}
		
		// 해당 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " + set.size());
		
		// 반복자
//		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		// 자료구조가 모두 비어있을 때 true값을 리턴
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		
	}

}
