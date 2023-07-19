package p2023_7_19;

class Member{
	
	String name = "이름";
	String id = "아이디";
	String password = "패스워드";
	int age;
}

public class FieldMember {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name = "최하얀";
		member.age = 23;
		
		System.out.println("이름 : " + member.name);
		System.out.println("나이 : " + member.age);
	}

}
