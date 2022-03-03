package a09_클래스_정보은닉;

public class Car {
	private String model; 
	
	public String getModel() {
		return model; // 외부에 값을 주기에 return
		
	}
	
	public void setModel(String model) { // set 내부에서 적용하기에 return X -> 그러기에 void사용
		this.model = model;
	}

}
