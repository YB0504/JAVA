package Model1EX;

import java.sql.Timestamp;

public class DTOEX {
	private int num;
	private String writer;
	private String subject;
	private String email;
	private String content;
	private String passwd;
	private String ip;
	private Timestamp reg_date;
	private int readcount;
	private int ref;
	private int re_level;
	private int re_step;

	public int getNum() {
		return num;
	}

	public String getWriter() {
		return writer;
	}

	public String getSubject() {
		return subject;
	}

	public String getEmail() {
		return email;
	}

	public String getContent() {
		return content;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getIp() {
		return ip;
	}

	public Timestamp getReg_date() {
		return reg_date;
	}

	public int getReadcount() {
		return readcount;
	}

	public int getRef() {
		return ref;
	}

	public int getRe_level() {
		return re_level;
	}

	public int getRe_step() {
		return re_step;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}

	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}

}
