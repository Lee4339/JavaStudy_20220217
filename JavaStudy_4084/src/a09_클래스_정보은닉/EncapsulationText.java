package a09_클래스_정보은닉;

public class EncapsulationText {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation("아이디", "패스워드", "kakao");
		
		encapsulation.showInfo();
		
		encapsulation.setUsername("아이디1111");
		String username = encapsulation.getUsername();
	}

}
