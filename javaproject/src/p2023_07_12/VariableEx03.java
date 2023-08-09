package p2023_07_12;

//이스케이프 문자 예제
public class VariableEx03 {

	public static void main(String[] args) {
		
		System.out.println("번호\t이름\t나이"); // tap 만큰 띄우기 두번 쓸때는 \t\t

		System.out.print("행 단위 출력\n"); // 줄 바꿈 \t와 동일하게 사용 시 두줄 변경

		System.out.print("행 단위 출력\n"); // 줄 바꿈

		System.out.println("우리는 \"개발자\"입니다"); // " 출력 \를 쓰지않고 ""를 더 사용하면 중복으로 오류

		System.out.println("봄\\여름\\가을\\겨울"); // \ 출력
	}

}
