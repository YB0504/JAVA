package p2023_8_02;

import java.util.Vector;

class Collections05 {
	public static void main(String[] args) {

		// 제네릭을 사용하지 않으면 여러가지 자료형을 모두 저장할 수 있다.
		Vector vec = new Vector();
		
//		boolean add(Object e)
		vec.add("Apple");	// 업캐스팅
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);

//		Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = (String) vec.get(i); // 다운 캐스팅
//		temp=vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
			System.out.println(temp.toLowerCase());
		}
	}
}
