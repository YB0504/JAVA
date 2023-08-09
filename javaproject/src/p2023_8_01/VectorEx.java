package p2023_8_01;

import java.util.List;
import java.util.Vector;

class Board {		// 필드

	String subject;
	String content;
	String writer;

	// 생성자
	// pDublic 조
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

}

public class VectorEx {

	public static void main(String[] args) {

//		제네릭 <> : 자료구조에 특정 자료형의 데이터만 저장할 수 있도록
//				   만들어 주는 역할
//		Vector 자료구조에는 Board 클래스로 만든 객체만 저장할 수 있다.
		List<Board> list = new Vector<Board>(); // 업캐스팅

		list.add(new Board("제목1", "제목1", "글쓴이1")); // 0
		list.add(new Board("제목2", "제목2", "글쓴이2")); // 1
		list.add(new Board("제목3", "제목3", "글쓴이3")); // 2
		list.add(new Board("제목4", "제목4", "글쓴이4")); // 3	2
		list.add(new Board("제목5", "제목5", "글쓴이5")); // 4	3

		list.remove(2);	// 인덱스 2번원소를 삭제
		list.remove(3);	// 인덱스 3번원소를 삭제

		for (int i = 0; i < list.size(); i++) {
					//	Object get(int index)
			Board board = list.get(i);		// 다운 캐스팅
//			Board board = (Board)list.get(i);		// 다운 캐스팅
			System.out.println
			(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
