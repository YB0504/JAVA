package p2023_07_11;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("자바 출력 성공");

		
		  System.out.println("Hello World");
		  
		  int score = 90;
		  int score1;
		  score1 = 95;
		  System.out.println(score);
		  
		  int hour = 5; int minute = 03;
		  
		  System.out.println("PM " + hour + "시 " + minute + "분");
		  
		  int value = 30; 
		  int result = value + 10; 
		  System.out.println(result);
		  
		  
		  int hour1 = 8; 
		  String a = "강의시간"; 
		  String b = "수업교재"; 
		  String c = "혼자 공부하는 자바";
		  
		  System.out.println("오늘 " + a + "은 " + hour1 + "시간 입니다." );
		  System.out.println("오늘 " + b + "는 " + c + "입니다." );
		 

		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		int var1 = 0b1011;  // 2진수 0b. 0B 로 시작
		int var2 = 0206; // 8진수 0으로 시작하고 0~7로 구성
		int var3 = 365; //10진수 소수점 없는 0~9 숫자로 구성
		int var4 = 0xB3; //16진수 0x, 0X로 시작하고 0~9 숫자와 ABCDEF, abcdef로 구성
		System.out.println("var1:"+ var1);
		System.out.println("var2:"+ var2);
		System.out.println("var3:"+ var3);
		
	}
}