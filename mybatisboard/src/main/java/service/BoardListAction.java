package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardListAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardListAction");

		// 기본 변수 설정
		// 1. 현재 페이지 번호 저장
		int page = 1;

		// 2. 한 페이지 출력할 데이터 개수
		// 값이 고정되어 있기 때문에 공유해서 가져갈 필요가 없다.
		int limit = 10;

		// 사용자가 선택한 페이지 번호를 형변환하여 저장
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}

		// 3. 총 데이터 개수
		// DB에 저장된 데이터 개수를 구해오는 메소드 호출을 위한 DAO객체 생성
		BoardDAO dao = BoardDAO.getInstance();
		int listcount = dao.getCount();
		System.out.println("listcount : " + listcount);

		// 파생 변수 설정
		// 목록에 출력될 데이터 개수를 잘라주기 위한 변수
		// 1. startRow : 선택된 페이지에 출력할 시작 게시글 번호
		// 2. endRow : 선택된 페이지에 출력할 마지막 게시글 번호
		int startRow = (page - 1) * limit + 1;
		int endRow = page * limit;

		// 게시판 목록 10개 구하기
//		List<BoardBean> boardlist = dao.getList(startRow, endRow);
//		List<BoardBean> boardlist = dao.getList(page);
//		// getList메소드로 실행된 값을 list에 저장
//		System.out.println("boardlist : " + boardlist);
		
		// Map으로 처리-------------------------------------------------------------------
		// startRow, endRow를 Key,Value 값으로 전달하여 저장
		Map map = new HashMap();
		map.put("start", startRow);
		map.put("end", endRow);
		
		List<BoardBean> boardlist = dao.getList(map);
		System.out.println("boardlist : " + boardlist);
//--------------------------------------------------------------------------------------

		// 3. 총 페이지 수
		// limit의 배수면 0 페이지 증가 10의 배수가 아니면 1페이지 증가
		int pageCount = listcount / limit + ((listcount % limit == 0) ? 0 : 1);

		// 4, 5번 파생 변수
		// 각 블럭의 시작과 끝 페이지 번호
		// 게시판 아래에 각 페이지 링크를 만들 때 사용
		int startPage = ((page - 1) / 10) * limit + 1; // 1, 11, 21
		int endPage = startPage + 10 - 1; // 10, 20, 30
		
		// 게시글의 번호값을 나타내는 파생변수는 list.jsp에서 만들어서 출력한다.

		// 데이터가 존재하지 않는 페이지가 나오지 않게 해준다.
		if (endPage > pageCount) {
			endPage = pageCount;
		}

		// 설정한 변수들을 request로 공유 설정한다.(View페이지에서 필요한 값만 가져간다.)
		// 기본 자료형이 공유되면 View페이지에서 공유설정한 name값으로 EL로 바로 출력할 수 있다.
		// list 자료형이 공유되면 View페이지에서 forEach의 items속성값에
		// 공유 설정한 name값이 들어간다.
		request.setAttribute("page", page);
		request.setAttribute("listcount", listcount);
		request.setAttribute("boardlist", boardlist);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);

		// request객체로 공유한 경우할 때는 dispatcher방식으로
		// 포워딩 되어야 공유된 값에 접근할 수 있다.
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/board_list.jsp");

		return forward;
	}

}
