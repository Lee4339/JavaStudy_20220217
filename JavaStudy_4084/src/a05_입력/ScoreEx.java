package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		/**
		 * int score 입력
		 * socre 마이너스 점수이거나 100점을 넘으면 x 출력
		 * 90이상 A
		 * 80이상 B
		 * 70이상 C
		 * 60이상 D
		 * 그외	  F
		 * 
		 * 성적을 입력해 주세요 : 85
		 * 학생의 평점은 B등급입니다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int score = 85;
		String grade = null; // 정리 해놓음으로 밑에  String을 제외하고 작성가능(깔끔)
		
		System.out.print("성적을 입력해 주세요 : ");
		score = sc.nextInt();
		grade = score > -1 && score < 101 ? 
			score > 89 ? "A" :
			score > 79 ? "B" :
			score > 69 ? "C" :
			score > 59 ? "D" :
			score > -1 ? "F" : "X" : "X";
		
				
		
		System.out.println("학생의 평점은 " + grade + "등급입니다." );

	}

}
