package p2023_7_27;

import java.text.DecimalFormat;

public class Homework {

	public static void main(String[] args) {

		int r = 5;

		// 원둘레
		double d1 = 2 * Math.PI * r;

		// 원 면적
		double d2 = Math.PI * r * r;

		// 구의 표면적
		double d3 = 4 * Math.PI * r * r;

		// 구의 부피
		// 분모나 분자를 double형으로 표기해야 제대로 연산된다.
//		double d4 = (double)4/ 3 * Math.PI * r * r * r;
		double d4 = 4.0 / 3 * Math.PI * r * r * r;

		// DecimalFormat()
		// import 필요
		// #은 0을 제외한 숫자를 채워준다(정수부분에 사용)
		// 자릿수가 맞아야 수를 채운다.
		// 0은 0을 포함한 숫자를 채워준다(소수점아래 실수 부분은 #보다 0을 사용하는 편이 좋다)
		// 자릿수가 안맞아도 0으로 채워준다.
		DecimalFormat df = new DecimalFormat("###.00");

		// format 메소드에 double형인 d1변수
		System.out.println("원 둘레 : " + df.format(d1));
		System.out.println("원 면적 : " + df.format(d2));
		System.out.println("구의 표면적 : " + df.format(d3));
		System.out.println("구의 부피 : " + df.format(d4));

	}

}
