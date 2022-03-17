package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "일건호");
		hashMap.put("나", "이건호");
		hashMap.put("다", "삼건호");
		hashMap.put("라", "사건호");
		hashMap.put("마", "오건호");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("사건호"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "육건호"));
		System.out.println(hashMap);


	}

}
