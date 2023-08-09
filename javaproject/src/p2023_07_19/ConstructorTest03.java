package p2023_07_19;

class MyDate03{   
  private int year;   // 필드 (멤버 변수)
  private int month;    
  private int day;
  
  // 생성자 : 객체를 생성할 때 호출 되고 필드 값을 초기화 시켜주는 역할을 함
  // 초기화 시킬 값이 없다면 생성자는 작성 안해도 됨
  public MyDate03(){ // 기본 생성자 (매개 변수가 없음) 
    year=2023;
    month=4;
    day=1;
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d = new MyDate03(); // 생성자 호출
    d.print(); // print 메소드를 이용해서 접근
    
    // private 접근 제어자는 외부 클래스의 접근을 허용하지 않기 때문에
    // 직접 접근할 수 없다.
//    System.out.println(d.year); // 오류 발생
    
  }
}               