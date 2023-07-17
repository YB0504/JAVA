package p2023_7_17;

public class GuGuDan {
	public static void main(String[] args) {
		
		 //단 title출력 
		for(int dan=2; dan<=9; dan++){ 
			System.out.print("[" + dan + "단]" + "\t");
		}
		System.out.println();
		for(int i=1; i<=9; i++){ // 1 ~ 9 를 곱함 (기준)
			for(int j=2; j<=9;j++){	// 각 단 출력  		
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}// j가 10이 되면 안쪽 for문을 빠져나오면서 줄을 바꿈
			System.out.println();
		}
	} 
}

