package practice12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DatastructureTest3 {

	public static void main(String[] args) {
		
		Map map0;
		
		//Key �� value ������ �����͸� �����Ѵ�.
		HashMap<String, String> map1 = new HashMap<>();
		
		//null ���� ������� �ʴ´�.
		Hashtable<String, String> map2 = new Hashtable<>();
		
		//���� �߰��ϴ� ���
		//Key���� �ߺ��� �Ǹ�ȵȴ�.
		map1.put("A01", "���ذ�������");
		map1.put("A02", "���ذ����Ĺ�");
		map1.put("A03", "���ذ��׷κ�");
		map1.put("C01", null);
		
//		map2.put("D01", null);
		//���� ��¹��
		System.out.println(map1);
//		System.out.println(map2);
		
		//���� ���
		map1.remove("C01");
		System.out.println(map1);
		

		
		//������ Ȯ�ι��
		System.out.println(map1.size());
		
		// for �� �����
		//java.util.Map.Entry
		//��Ʈ���� ����ϸ� Ű�� ������ ���ÿ� ���� ����
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		//map1.get(key)�ϸ� Value ���� ��ȯ�ȴ�.
		for(String key : map1.keySet()) {
			System.out.println(key+" : " + map1.get(key));
		}
		
		
		
	}

}