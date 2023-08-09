package p2023_07_20;

public class Shared {
    public static void main( String[] args ) {
    
    	// StaticCount의 객체 생성
        StaticCount sc1 = new StaticCount();
        System.out.println("sc1.number = " + sc1.number); // 3
        
        sc1.number++;	// number 값을 1 증가 시킨다.
        System.out.println("sc1.number = " + sc1.number); // 4
        
        StaticCount sc2 = new StaticCount();	// 마지막에 저장된 값을 사용함
        System.out.println("sc2.number = " + sc2.number); // 4
        
        sc2.number++;
        System.out.println("sc2.number = " + sc2.number); // 5
        
        StaticCount.number++;
        System.out.println(StaticCount.number);
        
    }
}
            
        
        
        