package p2023_07_18;

public class ArrFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] coffees = {"아메리카노", "라떼", "카페모카", "카푸치노"};
		
		for(int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i] + " 하나");
		}System.out.println("주세요");
		// 배열 복사
		for(String coffee : coffees) {
			System.out.println(coffee +"하나");
		}
		
	}

}
