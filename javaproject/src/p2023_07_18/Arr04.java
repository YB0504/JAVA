package p2023_07_18;

public class Arr04 {

  public static void main(String[] args) {
   
	// 2차원 배열의 두 번째 형식
    int [][]score = { { 85,  60,  70},   // 0 행
				      { 90,  95,  80},   // 1 행
				      { 75,  80, 100},   // 2 행
                      { 80,  70,  95},   // 3 행
				      {100,  65,  80}    // 4 행
					};
    int [] subject = new int[3]; // 과목총점 저장 subject라는 1차원 배열에 저장
    int [] student = new int[5]; // 학생의 총점 저장
    
    String[] subName = {"국어", "영어", "수학"};
    String[] stuName = {"1", "2", "3", "4", "5"};
    
    
    // subject[0]=0, subject[1]=0, subject[2]=0, 
    // student[0]=0; student[1]=0; student[2]=0; student[3]=0; student[4]=0;
    int  r, c;  
	    
    System.out.println("각 과목별 총점구하기 ");
    // 다중 for문
    for(c = 0; c < 3 ; c++){ // 과목 
      for(r = 0; r < 5 ; r++){ // 학생
        subject[c] += score[r][c]; // subject 배열 0번방에 0번열 과목의 점수가 저장
      } // subject[c]=subject[c]+score[r][c];
      System.out.println(subName[c]+ " 총점 : " +subject[c]); 
   // 지역변수가 아니기 떄문에 자동으로 초기값이 0으로 초기화
    }

    System.out.println("학생별 총점구하기");
    for(r = 0; r < 5 ; r++){    // 학생      
      for(c = 0; c < 3 ; c++){  // 과목    
        student[r] += score[r][c];  
      } // student[r]=student[r]+score[r][c];
      System.out.println(stuName[r]+ "번 학생" + "총점 : " +student[r]);
    }

  } // main() end
} // class end        