package p2023_08_02;

import java.util.Stack;


// Stack : LIFO(Last Input First Output) 구조

public class StackTest01 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());	// 예외 발생

		while (!myStack.isEmpty()) {	// Stack이 비어있지 않다면
			System.out.println(myStack.pop());
		}
	}
}
