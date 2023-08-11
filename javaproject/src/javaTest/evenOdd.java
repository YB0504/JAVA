package javaTest;

public class evenOdd {

	public static void main(String[] args) {

		int five = 0;
		int seven = 0;
		
		for(int i = 1; i <= 100; i++)
			if(i % 5 == 0) 
				five += i;
		
		for(int j = 1; j <= 100; j++)
			if(j % 7 == 0)
				seven += j;
			
		
		System.out.println("5의 배수의 합 : " + five);
		System.out.println("7의 배수의 합 : " + seven);
		
	}

}
