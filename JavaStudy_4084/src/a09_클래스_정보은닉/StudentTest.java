package a09_클래스_정보은닉;
/*
 * Student 클래스 정의
 * 
 * 속성
 * SchoolName
 * studentCode(학번) 202200000
 * studentYear
 * studentName
 * 
 * 생성장(기본, 전체)
 * getter, setter
 * 
 * 메소드 showStdentInfo
 * 학교명 : 코리아아이티아카데미
 * 학번 : 20220001
 * 학년 : 1학년
 * 이름 : 이건호
 * 학교명 : 코리아아이티아카데미
 * 학번 : 20220002
 * 학년 : 3학년
 * 이름 : 삼건호
 * 
 */

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("코리아아이티아카데미", 20220001, 1, "이건호");
		Student student2 = new Student("코리아아이티아카데미", 20220002, 3, "삼건호");
		
		student1.showStdentInfo();
		student2.showStdentInfo();
		
		

	}

}
