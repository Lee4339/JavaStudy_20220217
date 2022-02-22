package a05_입력;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 부산 사하구
		 */
		System.out.print("아이디 입력 : ");
		Scanner sc = new Scanner(System.in); 
		// import 하는 방법 1. Ctrl + Shift + o	   
		//                  2. Scann 한 후 자동완성 시키면 입력됨. =>	아무것도 없는 상태에서 처음 입력할 때 많이 사용
		//                  3. 마우스를 통해 입력
		String username = sc.next();
		String password = sc.next();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		String name = sc.next();
		sc.nextLine(); // Line은 enter의 버퍼가 남아서 들어와버리기 때문에 빈라인을 만들어서 날려줘야함
		// 버퍼를 쓰는 이유는 끊기지 않고 바로 바로 사용가능(데이터를 담아두는 곳)
		String address = sc.nextLine(); 
		
		// Ctrl + Alt + 위, 아래 (복사)
		System.out.println("아이디 : " + username);
		System.out.println("비밀번호 : " + password);
		System.out.println("생년월일 : " + year + "/" + month + "/" + day);
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		
		

	}

}
