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
		double d4 = 4 / 3 * Math.PI * r * r * r;

		// DecimalFormat()
		// #은 소수점 위의 정수
		// 0은 소수점 아래 자리의 개수
		DecimalFormat df = new DecimalFormat("####.00");

		// format 메소드에 double형인 d1변수
		System.out.println("원 둘레 : " + df.format(d1));
		System.out.println("원 면적 : " + df.format(d2));
		System.out.println("구의 표면적 : " + df.format(d3));
		System.out.println("구의 부피 : " + df.format(d4));

	}

}
