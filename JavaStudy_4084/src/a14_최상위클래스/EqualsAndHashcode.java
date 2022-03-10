package a14_최상위클래스;

public class EqualsAndHashcode {

	public static void main(String[] args) {
		Student s1 = new Student(1, 1, 1, "이건호");
		Student s2 = new Student(1, 1, 1, "이건호");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); 
		
		System.out.println(s1 == s2); // 주소가 다르게 나옴
		System.out.println(s1.equals(s2)); // equals를 통한 안에 들어가있는 값은 갔다는걸 알 수 있다.
	}

}
