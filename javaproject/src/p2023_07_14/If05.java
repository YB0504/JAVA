package p2023_07_14;

// p140
public class If05 {

	public static void main(String[] args) {
		
//	난수 발생 공식
//	난수 = (정수화) (Math.random() * (상한값 - 하한값 + 1)) + 하한값;
		
//	난수 발생			0.0 <= Math.random() < 1.0
//		Math m = new Math(); 생성자가 없기 떄문에 객체생성을 하면 오류가 발생 
		System.out.println("E = " + Math.E); // 자연로그
		System.out.println("PI = " + Math.PI); // 원주율
		System.out.println(Math.random()); // 난수 발생
		
// 주사위 번호 뽑기 : 	1           ~           6
		
		int num = (int) (Math.random() * 6) +1; // 1 ~ 6 double형태를 int형으로 변환
		System.out.println("num = " + num);
		
		if(num == 1) {
			System.out.println("1번");
		}else if(num == 2) {
			System.out.println("2번");
		}else if(num == 3) {
			System.out.println("3번");
		}else if(num == 4) {
			System.out.println("4번");
		}else if(num == 5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");			
		}
		
		System.out.println("1 ~ 45t사이의 난수 발생");
		int r = (int)(Math.random() * 45) + 1;
		System.out.println("난수 : " + r);
		
		
	}

}
