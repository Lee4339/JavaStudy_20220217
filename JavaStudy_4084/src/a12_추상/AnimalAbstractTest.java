package a12_추상;

public class AnimalAbstractTest {

	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle(); // 추상클래스는 생성할 수 없음
		
		human.move();
		tiger.move();
		eagle.move();

	}

}
