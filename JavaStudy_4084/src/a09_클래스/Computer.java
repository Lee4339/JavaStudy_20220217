package a09_클래스; // main check X

public class Computer {
	String model;
	
	public Computer() { // 자료형 생략 -> 생성자의 return 값은 무조건 주소값이다.
		System.out.println("컴퓨터 객체를 생성합니다.");
		
	}
	
	public void printInfo() {
		System.out.println("컴퓨터 모델: " + model);
	}

}
