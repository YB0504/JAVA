package p2023_7_25;

public class SplitEx01 {

	public static void main(String[] args) {
		
//		String[] split(String regex)
		
		String text = "홍길동&홍길순,김길동,김자바-여인범";
		
		String[] names = text.split("&|,|-");
		
		// 기본 for문
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + "\t");
		System.out.println();
		
		// 향상된 for문
		// 값을 전달 받기위한 변수에 각 배열의 값을 전달
		for(String name : names) 
			System.out.print(name + "\t");
		
	}

}
