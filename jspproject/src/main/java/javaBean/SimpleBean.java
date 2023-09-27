
// 자바빈 클래스
// DTO(Data Transfer Object)
// 여러가지 가입양식에서 넘어오는 값을 저장하고 전달한다.
package javaBean;

// 클래스와 메소드는 반드시 접근제어자가 public으로 되어있어야 JSP에서 접근할 수 있다.
public class SimpleBean {
	
	private String msg;					// 프로퍼티(property)
	private String name;

	public String getMsg() {			// 값을 전달
		return msg;
	}

	public void setMsg(String msg) {	// 값을 할당
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
