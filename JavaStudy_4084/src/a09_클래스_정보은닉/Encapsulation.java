package a09_클래스_정보은닉;

public class Encapsulation { 
	// private의 값은 다른 클래스에서 사용을 못하기에 get, set를 통해 만들어야한다.
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
	
	// getter
	// public  / 알트 + 쉬프트 + s = 겟터 셋터
	
	
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	
}
