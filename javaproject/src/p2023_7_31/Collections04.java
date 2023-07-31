package p2023_7_31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();			// 업캐스팅
//		ArrayList list = new ArrayList();

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);
		System.out.println(list);

		// 해당 index번호의 원소 추출
		// index번호는 0부터 시작
		// Object get(int index)
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		
		// Object get(int index)
		for (int i = 0; i < list.size(); i++) {
//  		System.out.println( i + " 번째 요소는 " + list.get(i));
			Object s = list.get(i);
//			String s =(String)(list.get(i)); 
			// 지금은 자료형이 여러가지가 섞여 있기 때문에 자료형을 지정하면 오류가 발생한다.
			System.out.println(s);
		}
		
		// 향상된 for문
		// for( 변수 : 순차적인 자료구조 )
		for(Object s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		// 반복자 : 값을 한꺼번에 가져와서 변수에 저장
		Iterator elements=list.iterator();    
		while(elements.hasNext()) {			// 가져올 데티터가 있을때만 true리턴
			System.out.println("\t\t" + elements.next());
			// next() : 데이터를 한 개씩 가져오는 역할
		}	

	}
}
