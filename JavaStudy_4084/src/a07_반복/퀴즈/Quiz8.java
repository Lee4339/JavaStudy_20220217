package a07_반복.퀴즈;


/*
 * 1 ~ 2001
 * 윤달이면 출력
 * 윤달이 아니면 출력x
 * 4의 배수이면서 100의 배수는 아니고 400의 배수인것
 * 
 */

public class Quiz8 {

	public static void main(String[] args) {
		for(int i = 0; i < 2001; i++) {
			int year = i + 1;
			if(!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) { // 윤년이 아닌 경우가 참이다.
				continue; // 밑에 명령을 무시하고 i++에서 증가된 값으로 시행해서 윤년인 경우가 나옴?
			}
			System.out.println(year);
		}
	}

}
