package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 2;
		
		switch(select) { //select 해당케이스부터 실행
			case 1 : 
				System.out.println("1을 선택하셨습니다.");
				break;
			case 2 : 
				System.out.println("2를 선택하셨습니다.");
				break;
			case 3 :
				System.out.println("3을 선택하셨습니다.");
				break;
			default : // if문의 else와 같이 case에서 값이 없을때 출력해준다.
				System.out.println("해당 case는 없습니다.");
		
		}
		String select2 = "이건호";
		
		switch(select2) { // 케이스 바로 다음은 문자면 문자 정수면 정수입력
			case "이건호" :
				System.out.println("선택하신 이름은 이건호입니다.");
				break; // 여기서 멈춤, switch문 탈출 
			case "삼건호" :
				System.out.println("선택하신 이름은 삼건호입니다.");
				break;
			case "사건호" :
				System.out.println("선택하신 이름은 사건호입니다.");
				break; // 전 문장에 break 입력시 출력하고 싶은 값만 출력됨
		}
		
		int num = 21;
		//if(num == 0) {
		//	System.out.println("0입니다.");
		//}else {
			switch(num == 0 ? 2 : num % 2) {
				case 0 :
					System.out.println("짝수 입니다.");
					break;
				case 1 : 
					System.out.println("홀수 입니다.");
					break;
				case 2 :
					System.out.println("0입니다.");
					break;
			}
			
		
		}

	}

