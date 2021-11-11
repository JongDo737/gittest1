package practice12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DatastructureTest3 {

	public static void main(String[] args) {
		
		Map map0;
		
		//Key 와 value 구조로 데이터를 저장한다.
		HashMap<String, String> map1 = new HashMap<>();
		
		//null 값을 허용하지 않는다.
		Hashtable<String, String> map2 = new Hashtable<>();
		
		//값을 추가하는 방법
		//Key값은 중복이 되면안된다.
		map1.put("A01", "김해공항정문");
		map1.put("A02", "김해공항후문");
		map1.put("A03", "김해공항로비");
		map1.put("C01", null);
		
//		map2.put("D01", null);
		//값을 출력방법
		System.out.println(map1);
//		System.out.println(map2);
		
		//삭제 방법
		map1.remove("C01");
		System.out.println(map1);
		

		
		//사이즈 확인방법
		System.out.println(map1.size());
		
		// for 문 사용방법
		//java.util.Map.Entry
		//엔트리를 사용하면 키와 벨류에 동시에 접근 가능
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		//map1.get(key)하면 Value 값이 반환된다.
		for(String key : map1.keySet()) {
			System.out.println(key+" : " + map1.get(key));
		}
		
		
		
	}

}