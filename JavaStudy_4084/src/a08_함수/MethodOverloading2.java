package a08_함수;

import java.util.Scanner;

/**
 * 
 * 오버로딩의 개념
 * 
 * 공통 : 메소드의 이름을 재사용할 수 있다.
 * 
 * 요리사에게 재료를 3개를 주면 3개를 가지고 요리를 해야하고 1개를 주면 하나의 재료로 요리를 해야한다.
 * 특징1. 매개변수의 개수에 따라 메소드를 정의 할 수 있다.
 * 
 * 요리사에게 재료 2개를 주고 도구 1개를 전달한다.
 * 특징2. 매개변수의 자료형이 다르면 매개변수의 개수가 같아도 정의 할 수 있다.
 *
 */
public class MethodOverloading2 {
	/*
	 * 계산기
	 * 입력
	 * 첫번째 수 입력
	 * 
	 * 사칙연산 (+, -, *, /)
	 * 
	 * 두번째 수 입력
	 * 
	 * 결과를 출력
	 * 
	 * 정수와 실수 모두 계산 가능해야함.
	 * 
	 * calc()
	 * 
	 * 오버로딩 예제가 아님
	 */
	public static String calc(String num1, String num2, char operator) {
		String result = null;
		
		if(operator == '+') {
		result = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
	}else if(operator == '-') {
		result = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
	}else if(operator == '*') {
		result = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
	}else if(operator == '/') {
		result = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
	}else {
		result = "계산을 할 수 없는 연산자 입니다.";
	}
		return result;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = null;
		String num2 = null;
		char operator = ' '; 
		
		System.out.print("첫번째 수 입력: ");
		num1 = sc.next();
		
		System.out.print("연산할 기호를 선택하세요: ");
		operator = sc.next().charAt(0);
		
		System.out.print("두번째 수 입력: ");
		num2 = sc.next();
		
		System.out.println("결과 : " + calc(num1, num2, operator));
		
		
		
		

	}

}
