package p2023_07_19;

//p228

class FieldInitValue{
	// 필드
	// 0으로 초기화
	byte byteField;
	short shortField;
	int intField;
	long longField;
	// false로 초기화
	boolean booleanField;
	char charField;
	// 0.0으로 초기화
	float floatField;
	double doubleField;
	// null로 초기화 null : 참조할 주소가 없다는 의미
	int[] arrField;
	String referenceField;
}


public class FieldInitValueEx {

	public static void main(String[] args) {
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("referenceField : " + fiv.referenceField);
		
		
		
	}

}
