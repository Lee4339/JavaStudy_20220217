package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5]; // users 주소값이 들어감
		
		users[0] = new User("aaaa", "1234");
		users[1] = new User("aaa1", "12345");
		users[2] = new User("aaa2", "12346");
		users[3] = new User("aaa3", "12347");
		users[4] = new User("aaa4", "12348");
		
		
		for(int i = 0; i < users.length; i++) {
//			if(users[i] != null) {
//			users[i].showInfo(); //System.out.println(users[i]); ----> 주소를 넣어주었기에 0번째만 뜨고 그 후는 참조할 주소가 없어서 뜨지않음
//			}
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		System.out.println("===========================================");
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
