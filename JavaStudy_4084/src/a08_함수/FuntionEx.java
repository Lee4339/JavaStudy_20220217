package a08_함수;

public class FuntionEx {
	
	public static int calc(int x, int y, int z) { // return 되는 값이 'int'다. / calc : 함수의 이름 / x, y, z - 변수들
		int result = x + y;
		int result2 = result * z;
		return result2; // return 결과(result2)를 반환
		// class 안에 만든 내용을 메소드라고 한다.(자바에서는 함수라는 정의는 모두 메소드라고 함) / 자바에서는 함수라는 정의가 존재 x
	}

	public static void main(String[] args) {
		
		//int r = calc(10, 20, 30); // 호출
		System.out.println(calc(10, 20, 30));
		System.out.println(calc(11, 20, 30));
		System.out.println(calc(12, 20, 30));
		System.out.println(calc(13, 20, 30));
		System.out.println(calc(14, 20, 30));
		System.out.println(calc(15, 20, 30));
		

	}

}
