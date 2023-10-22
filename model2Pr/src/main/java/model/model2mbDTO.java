package model;

import java.sql.Timestamp;

public class model2mbDTO {
	private String id;
	private String passwd;
	private String name;
	private String jumin1;
	private String jumin2;
	private String mailid;
	private String domain;
	private String post;
	private String address;
	private String intro;
	private Timestamp register;

	public String getId() {
		return id;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getName() {
		return name;
	}

	public String getJumin1() {
		return jumin1;
	}

	public String getJumin2() {
		return jumin2;
	}

	public String getMailid() {
		return mailid;
	}

	public String getDomain() {
		return domain;
	}

	public String getPost() {
		return post;
	}

	public String getAddress() {
		return address;
	}

	public String getIntro() {
		return intro;
	}

	public Timestamp getRegister() {
		return register;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}

	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public void setRegister(Timestamp register) {
		this.register = register;
	}

}
