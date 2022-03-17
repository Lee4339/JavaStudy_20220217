package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		
		service.addStudent("일건호", "aaaa@gmail.com", "부산 서구");
		service.addStudent("이건호", "bbbb@gmail.com", "부산 사하구");
		service.addStudent("삼건호", "cccc@gmail.com", "부산 남구");
		service.showStudentAll();
		
		service.updateStudentByName("일건호", "dddd@kakao.com", "부산 동래구");
		service.showStudentByName("일건호");
		
		service.deleteStudentByName("삼건호");
		service.showStudentAll();
		
		
		
		
	}

}
