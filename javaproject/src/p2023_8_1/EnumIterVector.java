package p2023_8_1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumIterVector {

	public static void main(String[] args) {

		// Vector 객체 생성
		// 기본 생성자도 사용 가능
		Vector v = new Vector(1, 1);

		// Vector에 Object 저장
		// 두 가지 메소드 모두 매개변수가 Object
		v.add(30);
		v.addElement(new Integer(10));
		v.addElement("johnharu");
		v.addElement("gracedew");
		
//		방법 1. Vector 자료구조에 저장된 데이터 출력
		System.out.println(v); // [30, 10, johnharu, gracedew]
		
//		방법 2. index 번호순으로 출력
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");
		}// 30	10	johnharu	gracedew
		System.out.println();
		
//		방법 3. 나열형(Enumeration)
		// Vector의 Object의 나열형을 리턴
		Enumeration e = v.elements();
		
		// Enumeration을 이용해 Vector의 Object를 출력
		while (e.hasMoreElements()) {	// 가져올 데이터가 있을 때 true
			System.out.print(e.nextElement() + "\t");
		}
		System.out.println();

//		방법 4. Iterator(반복자)를 사용
		// Vector의 Object의 나열형을 리턴
		Iterator ie = v.iterator();

		// Iterator을 이용해 Vector의 Object를 출력
		while (ie.hasNext()) {
			System.out.print(ie.next() + "\t");
		}

	} // main end
}
