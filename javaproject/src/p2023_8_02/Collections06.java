package p2023_8_02;

import java.util.Vector;

class Collections06 {
	public static void main(String[] args) {
		
//	제네릭 (Generic) : 자료구조에 한 가지 자료형의 데이터만 저장할 수 있게 해주는 것
		Vector<String> vec = new Vector<String>();

		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);		오류 발생

//	제네릭을 사용하게 되면, 자료구조에서 데이터를 구해 올때
//	제네릭으로 설정된 자료형은 생략할 수 있다.
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);	// 다운 캐스팅 할 때에 자료형이 생략되어 있다.
			System.out.println(temp.toUpperCase());
		}
	}
}
