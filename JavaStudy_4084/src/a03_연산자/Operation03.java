package a03_연산자;

public class Operation03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result1 = num1 < num2 ? 1 : 2; // ? : 참인가? - True : 1, False : 2
		
		System.out.println(result1);
		
		boolean result2 = num1 > num2 ? true : false;
		System.out.println(result2);

	}

}
