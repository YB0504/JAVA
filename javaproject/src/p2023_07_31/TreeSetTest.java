package p2023_07_31;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
// TreeSet
// 1. 데이터를 오름차순으로 정렬해서 저장하고 출력하는 기능을 제공한다.
// 2. 중복된 데이터를 저장할 수 없다.
	
//		오름차순 정렬						내림차순 정렬
//	----------------------------------------------------------
//	숫자 : 작은 숫자 -> 큰 숫자			큰 숫자 -> 작은 숫자
//		ex) 1,2,3,4..			ex) ..4,3,2,1
//	문자 : 사전 순 정렬					사전 역순 정렬
//		ex) a,b,c...			ex) z,y,x...
	
	public static void main(String[] args) {
		
		TreeSet hs = new TreeSet();

//		boolean add(Object e)
		if (hs.add("korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		} else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		if (hs.add("japan")) {
			System.out.println("japan 추가 성공");
		} else {
			System.out.println("japan 추가 실패");
		}
		if (hs.add("america")) {
			System.out.println("america 추가 성공");
		} else {
			System.out.println("america 추가 실패");
		}
		if (hs.add("britain")) {
			System.out.println("britain 추가 성공");
		} else {
			System.out.println("britain 추가 실패");
		}
		if (hs.add("korea")) {	// 중복된 데이터
			System.out.println("두 번째 korea 추가 성공");
		} else {
			System.out.println("두 번째 korea 추가 실패");
		}
		
		// 가장 간단한 출력 방법 ( 오름 차순 정렬 )
		System.out.println(hs); // [america, britain, japan, korea]

		// Iterator(반복자) : america, britain, japan, korea
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			// next() : 데이터를 1개씩 가져오는 역할
		}
	}
}
