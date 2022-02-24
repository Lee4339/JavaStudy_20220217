package a07_반복;

public class LoopEx {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += ++num;
		}
		System.out.println(result);
		
		// 가장 많이 사용하는 방식
		int i = 0;
		while(i < 100) {
			i++;
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int j = 0; j < 100; j++) { // j라는 변수를 이 for문 안에서만 사용가능
			System.out.println(j);     // 하지만 전체적으로 j변수가 입력되어 있으면 for문에서 사용불가
		}
		
		int k = 0;
		for(; k < 100;) {
			System.out.println(k);
			k++;
		}

}
}
