package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Member;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDao {

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
	public int insert(Member member) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			// Mapper파일에 있는 SQL문의 id값을 불러와서 실행한다.
			result = session.insert("insert", member); // ("SQL의 id값", 전달될 값)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	// 회원인증(로그인)
	public int chk(Member member) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			Member mem = (Member) session.selectOne("select", member.getId());
			if (mem.getId().equals(member.getId())) {
				result = -1;
				if (mem.getPassword().equals(member.getPassword())) {
					result = 1;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	// 회원 1명 조회
	public Member select(String id) throws SQLException {
		Member mem = null;
		SqlSession session = null;
		try {
			session = getSession();
			mem = (Member) session.selectOne("select", id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return mem;
	}

	// 회원목록 조회
	public List<Member> list() {
		List<Member> list = new ArrayList<Member>();
		SqlSession session = null;
		try {
			session = getSession();
			list = session.selectList("list");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// 회원수정
	public int update(Member mem) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			result = session.update("update", mem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	// 회원삭제
	public int delete(String id) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			result = session.delete("delete", id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

}
