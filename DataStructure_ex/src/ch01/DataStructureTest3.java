package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest3 {

	public static void main(String[] args) {
		
		Map map0;
		
		//Key �� value ������ �����͸� �����Ѵ�.
		HashMap<String, String> map1 = new HashMap<>();
		
		//null ���� ������� �ʴ´�.
		Hashtable<String, String> map2 = new Hashtable<>();
		
		//���� �߰��ϴ� ���
		//Key���� �ߺ��� �Ǹ�ȵȴ�.
		map1.put("A01", "������������");
		map1.put("A02", "���������Ĺ�");		
		map1.put("A03", "�������׷κ�");		
		map1.put("B01", "��õ��������");		
		map1.put("B02", "��õ�����Ĺ�");		
		map1.put("B03", "��õ���׷κ�");		
		map1.put("C01", null);
		System.out.println(map1);
		
//		map2.put("D01", null);
		System.out.println(map2);
		
		//���� ��¹��
		System.out.println("------------------");
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("A02"));
		System.out.println(map1.get("A03"));
		
		
		//���� ���
		map1.remove("C01");
		System.out.println("------------------");
		System.out.println(map1);
		
//		map1.clear();
		
		//������ Ȯ�ι��
		System.out.println(map1.size());
		
		// for �� �����
		//java.util.Map.Entry
		//��Ʈ���� ����ϸ� Ű�� ������ ���ÿ� ���� ����
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("key : "+entry.getKey() + " /  value : "+ entry.getValue());
		}
		System.out.println("-------");
		
		for (String key : map1.keySet()) {
			System.out.println(key + " : "+ map1.get(key));
		}
		//map1.get(key)�ϸ� Value ���� ��ȯ�ȴ�.
		
		
		
		
	}

}