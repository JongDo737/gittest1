package ch11;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String ������
		// heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		String str1 = new String("abc");
		
		//data, static, 'constant pool'������ ��ġ�Ѵ�.
		String str2 = "abc";
		//�Ѵ� ������ Ÿ���� ������
		// �޸𸮿� �ö󰡴� ��ġ�� �ٸ�.
		
		String str3= "abc";
		
		
		//�ּҰ��� ��µ��� �ʰ� ���� ��µȴ�.
		System.out.println(str1);
		
		//false �޸� ������ �ٸ��� ������
		System.out.println(str1 == str2);
		
		//true 
		System.out.println(str2 == str3);
		
		String str4 = new String();
		String str5 = new String();
		
		//false
		System.out.println(str4 == str5);
		
		String str6 = "abc";
		String str7 = "abc";
		
		//true
		System.out.println(str6 == str7);
		
		//heap�޸𸮿� �ö� String ������ 3��
		//�ٸ� �ּҰ��� ����� �ϳ��� �����.
		//constant pool �޸𸮿� �ö� String ������ 1��
		//abc�� �������� ���� �༮�� ��� ������
		
		//���
		//heap �޸𸮴� ������ �� ���� �ٸ� �ּҰ��� ��������,
		//constant pool�� ������ ���ڿ��� ��� ���� �ּҰ��� ������.
		//(���� ���ڿ��� ���)
	}

}
