package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 *  학번 : 20220001 				-> studentCode(정수)
		 *  이름 : 이건호   				-> name1, name2, name3(문자)
		 *  학년 : 1        				-> sutudentYear(정수)
		 *  성적 : 85.5     				-> score(실수)
		 *  평점 : B						-> grade(문자)
		 *  성별 : 남성(true), 여성(false)  -> gender(boolean)
		 */
		int studentCode = 20220001;
		char name1 = '이';
		char name2 = '건';
		char name3 = '호';
		int studentYear = 1;
		double score = 85.5;
		char grade = 'B';
		boolean gender = true;
		
		
		System.out.print("학번 : ");
		System.out.println(studentCode);
		
		System.out.print("이름 : ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		System.out.print("학년 : ");
		System.out.println(studentYear);
		
		System.out.print("성적 : ");
		System.out.println(score);
		
		System.out.print("평점 : ");
		System.out.println(grade);
		
		System.out.print("성별 : ");
		System.out.println(gender);
		
		System.out.println();
		System.out.println();
		
		//간소화
		System.out.println("학번 : " + studentCode);
		System.out.println("이름 : " + name1 + name2 + name3);
//		System.out.print("이름 : ");
//		System.out.println(""+ name1 + name2 + name3 ); // ""가 문자열로 업캐스팅
//		System.out.print("성적 : ");
//		System.out.println(score + 5); // 5라고 적혀 있지만 업캐스팅 되서 5.0으로 인식
		

	}
}
