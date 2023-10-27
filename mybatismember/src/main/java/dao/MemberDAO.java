package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.MemberDTO;

public class MemberDAO {

	// 싱글톤은 외부에서 접근하지 못하도록 private접근 제어자로 만든다.
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	// SqlSession : SQL문을 실행시키는 메소드를 제공하는 인터페이스
	private SqlSession getSession() {

		SqlSession session = null;
		Reader reader = null;
		try {

			// 환경설정 파일을 읽어오면서 DB에 접속한다.(절대 경로)
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession(true); // auto commit
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return session;
	}

	// 회원가입
	public int insert(MemberDTO member) {
		int result = 0;
		SqlSession session = null;

		try {

			session = getSession();
			result = session.insert("insert", member);
		//	session.commit();	// auto commit을 설정 안했을 시 commit하는 법
		//	session.close();	// 원칙 대로는 session사용 후 닫아줘야한다.
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// ID 중복 검사(ajax)
	public int idcheck(String id) {
		int result = 0;
		SqlSession session = null;

		try {

			session = getSession();
			MemberDTO member = session.selectOne("idcheck", id);

			if (member != null) { // 중복 ID
				result = 1;
			} else { // 사용 가능한 ID
				result = -1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 로그인(회원인증)
	public int memberAuth(String id, String passwd) {
		int result = 0;
		SqlSession session = null;

		try {

			session = getSession();
			MemberDTO member = session.selectOne("idcheck", id);

			if (member != null) { // 중복 ID
				if (member.getPasswd().equals(passwd)) {
					result = 1; // 로그인 성공
				} else {
					result = -1; // 로그인 실패
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 회원 1명의 상세정보 구하기(회원 정보 수정 폼)
	public MemberDTO getMember(String id) {
		MemberDTO member = new MemberDTO();

		SqlSession session = null;

		try {

			session = getSession();
			member = session.selectOne("idcheck", id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return member;
	}

	// 회원 정보 수정
	public int update(MemberDTO member) {
		int result = 0;

		SqlSession session = null;

		try {

			session = getSession();
			result = session.update("update", member);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 회원 탈퇴
	public int delete(String id) {
		int result = 0;

		SqlSession session = null;

		try {

			session = getSession();
			result = session.delete("delete", id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
