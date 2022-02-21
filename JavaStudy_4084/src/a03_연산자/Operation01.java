package a03_연산자;

public class Operation01 {

	public static void main(String[] args) {
		// 증(가)감(소)연산자
		int score = 10;
		// score = score + 1;
		// 앞에 ++(선증가-선감소), 뒤에++(후증가-후감소)
		//System.out.println(++score); -> 바로 증가
		System.out.println(score--); // 현 문장에서 증가나 감소하지는 않으나 다음score의 사용 때 증가나 감소해 있는 상태
		System.out.println(score);
		System.out.println(score++);
		System.out.println(score);

	}

}
