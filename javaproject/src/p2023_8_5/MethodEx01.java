package p2023_8_5;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {

	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (double) ((kor + eng + math) / 3d);
	}

	public String info() {
		return name 
				+ "," + ban 
				+ "," + no 
				+ "," + kor 
				+ "," + eng 
				+ "," + math 
				+ "," + getTotal() 
				+ "," + getAverage();

	}

}

public class MethodEx01 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.printf("평균 : %.1f ", + s.getAverage());
	}

}





