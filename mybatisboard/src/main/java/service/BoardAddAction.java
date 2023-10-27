package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDAO;
import model.BoardBean;

public class BoardAddAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardAddAction");

		// upload될 경로값
		String path = request.getRealPath("boardupload");
		System.out.println("path : " + path);

		// 첨부파일 크기 설정
		int size = 1024 * 1024;

		// MultipartRequest클래스로 객체 생성하여 파일 업로드 수행
		MultipartRequest multi = new MultipartRequest(request, path, // 업로드 디렉토리
				size, // 업로드 파일 크기
				"utf-8", // 인코딩 타입
				new DefaultFileRenamePolicy()); // 파일 중복 문제 해결

		// 입력한 값을 저장하기 위한 DTO객체 생성(저장공간 생성)
		BoardBean board = new BoardBean();
		board.setBoard_name(multi.getParameter("board_name"));
		board.setBoard_pass(multi.getParameter("board_pass"));
		board.setBoard_subject(multi.getParameter("board_subject"));
		board.setBoard_content(multi.getParameter("board_content"));
		board.setBoard_file(multi.getFilesystemName("board_file"));

		// dao클래스 내부의 메소드를 호출하기 위한 DB접속
		BoardDAO dao = BoardDAO.getInstance();
		int result = dao.insert(board);
		if (result == 1)
			System.out.println("글 작성 성공");

		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		// 글작성 후에 목록을 구해오는 Service클래스로 한번 더 요청한다.
		// list.jsp로 바로 이동하면 데이터가 없는 상태로 이동하게 된다.
		forward.setPath("./BoardListAction.do");

		return forward;
	}

}
