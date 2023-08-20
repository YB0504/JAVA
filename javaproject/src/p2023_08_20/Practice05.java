package p2023_08_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution05 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length - 5];

		Arrays.sort(num_list);

		for (int i = 5; i < num_list.length; i++) {
			answer[i - 5] = num_list[i];
		}

		return answer;
		
		
//		int[] answer = {};
//
//		Arrays.sort(num_list);
//
//		answer = Arrays.copyOfRange(num_list, 5, num_list.length);
//		copyOfRange (해당 배열, 인덱스 번호, 해당 배열의 길이)
//		정렬한 num_list배열을 복사하여 answer값에 저장
//
//		return answer;

		
		
//		List 인터페이스를 활용한 방법
//		Arrays.sort(num_list);

//		List<Integer> resultList = new ArrayList<>();

//		for (int i = 5; i < num_list.length; i++) {
//			resultList.add(num_list[i]);
//		add()를 활용하여 인덱스 5번방부터 배열의 끝까지 resultList에 저장
//		}

//		answer배열에 위에서 만든 List의 크기 만큼 객체 생성 
//		int[] answer = new int[resultList.size()];
//		for (int i = 0; i < resultList.size(); i++) {
//			answer[i] = resultList.get(i);
//		반복문을 루프 돌면서 get()로 List의 값을 answer 배열에 하나씩 저장
//		}
//
//		return answer;

	}
}




