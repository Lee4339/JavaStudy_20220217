package a11_상속;

public class Eagle extends Animal {
	@Override // 어노테이션
	public void move() {
		System.out.println("독수리가 하늘을 납니다."); //부모의 것이 실행되지 않고 자식의 것이 실행
		// super.move(); // super는 부모의 주소 // 부모의 것이 실행
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘로 날아 올라갑니다.");
	}

}
