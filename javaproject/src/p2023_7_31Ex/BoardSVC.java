package p2023_7_31Ex;

// DAO(Data Access Object) 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// 글 입력 처리 메소드
	public void writeArticle(Scanner sc) {
		System.out.println("게시판에 글을 작성 하세요?");
		System.out.print("작성자:");
		String register = sc.next();

		System.out.print("이메일:");
		String email = sc.next();

		System.out.print("비밀번호:");
		String passwd = sc.next();

		System.out.print("제목:");
		String subject = sc.next();

		System.out.print("글내용:");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
//		boardVO.register = "홍길동";	필드의 접근제어자가 praivate라서 직접 겁근 불가
		addArticle(boardVO);
	}

	// 글 작성
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// 글목록 출력
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				// 작성된 글이 있으면
				System.out.println(boardList.get(i).toString());
			}
		} else {
			System.out.println("등록된 글이 없습니다.");
		}
	}

	// 삭제할 글의 작성자 및 비밀번호 입력하는 메소드
	public void removeArticle(Scanner sc) {
		System.out.println("저장할 글의 작성자와 비밀번호를 입력 하세요?");
		System.out.print("작성자:");
		String register = sc.next();

		System.out.print("비밀번호:");
		String passwd = sc.next();

		removeArticle(register, passwd);
	}

	// 글 삭제
	public void removeArticle(String register, String passwd) {
		if (boardList.size() > 0) {	// 삭제할 글이 있으면
			int index = -1;	// 직접 입력한 작성자명과 비밀번호를 메모리상에 저장된 값과 비교
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register)) {	// 작성자명 비교
					if (boardList.get(i).getPasswd().equals(passwd)) {	// 비밀번호 비교
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
			if (index == -1) {	// 작성자명과 비밀번호가 일치하지 않는 경우
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
		} else {
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}
}
