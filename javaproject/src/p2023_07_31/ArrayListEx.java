package p2023_07_31;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP"); // 인덱스 2번에서 3번으로 이동
		list.add(2, "Database");
		// 인덱스 2번위치에 Database 추가
		// 원래 위치에 있던 데이터가 하나 뒤로 밀려난다.
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();

		// 인덱스 2번 데이터를 구해와서 skill변수에 저장 후 출력
		String skill = list.get(2);
		System.out.println("2 : " + skill);	// 2 : Database
		System.out.println();

		for (int i = 0; i < list.size(); i++) {	// 0 : JAVA
			String str = list.get(i);			// 1 : JDBC
			System.out.println(i + " : " + str);// 2 : Database
												// 3 : Servlet/JSP
												// 4 : iBATIS
		}
		System.out.println();

//		remove ( int index ) : 특정 인덱스 번호를 가진 원소를 삭제하는 역할
		list.remove(2);		// Database
		list.remove(2);		// Servlet/JSP
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {	// 0 : JAVA
			String str = list.get(i);			// 1 : JDBC
			System.out.println(i + " : " + str);
		}

	}

}
