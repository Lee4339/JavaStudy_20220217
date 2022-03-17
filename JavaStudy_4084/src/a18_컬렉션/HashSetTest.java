package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("일건호");
		strSet.add("이건호");
		strSet.add("삼건호");
		strSet.add("사건호");
		System.out.println(strSet);
		
		strSet.remove("삼건호");
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator(); 
		while(ir.hasNext()) {
			String str = ir.next(); // BoF -- EoF
			if(str.equals("사건호")) {
			System.out.println(str);
			}
		}
		

	}

}
