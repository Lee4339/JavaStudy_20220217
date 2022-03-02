package a09_클래스;

public class StudentTest {
	/**
	 * Student(클래스)
	 * 속성
	 * schoolName
	 * studentYear
	 * studentGroup
	 * studentNumber
	 * studentName
	 * studentAddress
	 * studentPhone
	 * graduationFlag(boolean)
	 * 
	 * 기능(메소드)
	 * showStudentInfo()
	 * 학교명 : 부산고등학교
	 * 학년 : 3
	 * 반 : 2
	 * 번호 : 10
	 * 이름 : 이건호
	 * 주소 : 부산 사하구
	 * 연락처 : 010-9307-4084
	 * 졸업구분 :재학중 [true(졸업), false(재학중)];
	 * 
	 * incrementYear()
	 * 학년 + 1
	 * 학년 3학년을 넘어서면 graduationFlag = true; 
	 */

	public static void main(String[] args) {
		Student s1 = new Student("부산고등학교", 1, 2, 10, "이건호", "부산 사하구", "010-9307-4084", false);
		
		s1.showStudentInfo();
		System.out.println();
		s1.incrementYear();
		s1.showStudentInfo();
		System.out.println();
		s1.incrementYear();
		s1.showStudentInfo();
		System.out.println();
		s1.incrementYear();
		s1.showStudentInfo();
		
		Student s2 = new Student("경남고등학교", "이건호");
		s2.showStudentInfo();

	}

}
