package a11_상속;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		// 자식 -> 부모 : 업캐스팅
		Test t1 = test1;
		Test t2 = test2;
		
		Test[] tArray = new Test[2];
		tArray[0] = test1;
		tArray[1] = test2;
		
		
		// 부모 -> 자식 : 다운캐스팅 - 명시적
		Test1 tt1 = (Test1)t1;
		Test2 tt2 = (Test2)t2;
		
		// 잘못된 다운캐스팅1
		Test ttt = new Test();
		Test1 ttt1 = (Test1)ttt; // 문법상 문제는 없지만 ttt에 자식이 원래 존재하지 않아 실행되지 않음
		
		// 잘못된 다운캐스팅2 - 다운캐스팅은 업캐스팅 이후에만 가능하지만 밑에 상황같은 경우 잘못된 경우임
		Test1 tttt1 = new Test1();
		Test tttt = tttt1; // 업캐스팅
		Test2 tttt2 = (Test2)tttt; // 다른 자식으로의 변환은 안됨
		

	}

}
