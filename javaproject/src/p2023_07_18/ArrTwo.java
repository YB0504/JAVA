package p2023_07_18;

public class ArrTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
		String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
		String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
		
		// {} 안에 배열값을 넣고 , 로 연결한후 ; 으로 마무리
		// 3 * 5 크키의 2차원 배열
		String[][] seats = new String[][] {
			{"A1", "A2", "A3", "A4", "A5"},
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"},
		};
		
		// B2에 접근하려면?
		System.out.println(seats[1][1]);
		
		// C5에  접근하려면?
		System.out.println(seats[2][4]);
		
		String[][] seats2 = {
				{"A1", "A2", "A3"},
				{"B1", "B2", "B3", "B4"},
				{"C1", "C2", "C3", "C4", "C5"},
		};
		
		System.out.println(seats[0][2]);
		
		
	}

}
