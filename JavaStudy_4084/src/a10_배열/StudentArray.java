package a10_배열;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("일건호", 1);
		students[1] = new Student("이건호", 4);
		students[2] = new Student("삼건호", 3);
		students[3] = new Student("사건호", 1);
		students[4] = new Student("오건호", 2);
		
		/*
		 * 1학년: 2명
		 * 2학년: 1명
		 * 3학년: 1명
		 * 4학년: 1명
		 * 
		 */
		int[] yearCount = new int[4];
		String name1 = null;
		String name2 = null;
		String name3 = null;
		String name4 = null;
		String[] names1 = new String[students.length];
		String[] names2 = new String[students.length];
		String[] names3 = new String[students.length];
		String[] names4 = new String[students.length];
		
		for(int i = 0; i < students.length; i++) {
			
			int studentYear = students[i].getStudentYear();
			if(studentYear == 1) {
				yearCount[0]++;
				names1[i] = students[i].getStudentName();
			}else if(studentYear == 2) {
				yearCount[1]++;
				names2[i] = students[i].getStudentName();
			}else if(studentYear == 3) {
				yearCount[2]++;
				names3[i] = students[i].getStudentName();
			}else if(studentYear == 4) {
				yearCount[3]++;
				names4[i] = students[i].getStudentName();
			}
		}
		System.out.println("1학년: " + yearCount[0] + "명");
		System.out.println("2학년: " + yearCount[1] + "명");
		System.out.println("3학년: " + yearCount[2] + "명");
		System.out.println("4학년: " + yearCount[3] + "명");

		
	}
	
}
