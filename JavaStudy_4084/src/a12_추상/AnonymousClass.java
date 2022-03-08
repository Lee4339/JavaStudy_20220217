package a12_추상;

/**
 * 
 * 익명클래스, 무명클래스
 *
 */

public class AnonymousClass {

	public static void main(String[] args) {
		Animal animal1 = new Animal() { 
			// 상속받는 클래스가 없기에 임시로 한번만 생성시키겠다 --> 한번쓰고 버림
			// 굳이 클래스까지 만들 필요 없이 한번만 사용하는 경우에 이렇게 사용한다.
										
			@Override
			public void move() {
				System.out.println("토끼가 뜁니다.");
				
			}
		};
		
		Animal animal2 = new Animal() { 
			@Override
			public void move() {
				System.out.println("강아지가 뜁니다.");
				
			}
		};
		
		//Animal animal3 = new Animal() {};
		
		animal1.move();
		

	}

}
