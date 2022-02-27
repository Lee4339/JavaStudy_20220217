package a07_반복;

public class ContinueEx {
	/*
	 * continue	 ->	 계속하다
	 */

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i != 0 && i % 2 == 0) {
				continue; 
				//continue가 있을 시 밑의 명령은 무시되고 i++ 연산자로 가서 증가시킨 다음 반복으로 넘어감
			}
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}

	}

}
