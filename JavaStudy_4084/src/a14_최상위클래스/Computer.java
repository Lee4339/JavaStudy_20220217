package a14_최상위클래스;

public class Computer {	// extends Object에 상속받는게 생략되어있음
	
	@Override
	public String toString() {
		return "이건호"; //변경가능 --> super.toString();
	}
	
	public void computerTest() {
		System.out.println("컴퓨터 TEST 메소드");
	}
}
