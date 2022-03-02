package a09_클래스_정보은닉;

public class Encapsulation {
	private String username; //아이디
	private String password; //비밀번호
	private String provider; //서비스회사 google, kakao, naver
	
	public Encapsulation(String password, String provider) {
		super();
		this.password = password;
		this.provider = provider;
	}
	
	public void setUsername(String username) { // set : 값을 유입
		if(provider.equals("kakao")) {			
			this.username = username + "@kakao.com";
			
		}else if(provider.equals("google")){
			this.username = username + "@gmail.com";
			
		}else if(provider.equals("naver")) {
			this.username = username = "@naver.com";
			
		}else {
			this.username = username;
		}
	}
	
	public String getUsername() { // get : 값을 가져오기위해
		return username;
	}
	
	
	
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
	}
	
	
}
