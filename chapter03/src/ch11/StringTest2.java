package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// �ѹ� ������ String�� �Һ�(immutable)�� ������ ����
		
		//String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ�
		//���ο� ���ڿ��� �����ȴ�.
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		//System.identityHashCode(java) �ּҰ� Ȯ���ϴ� ���
		System.out.println(System.identityHashCode(java));
		
		//java = java + android;
		//.concat : ���ڿ��� �������ִ� �޼���
		java = java.concat(android);
		//javaandroid
		System.out.println(java);
		//���ο� �ּҰ��� ������.
		System.out.println(System.identityHashCode(java));
		
		//String ���� ä��ĥ�� ��� new �� ���ְ� �Ǹ� �޸� ���� ��������.
		//��� �ּҰ��� �����Ǳ� ������
		
		
	}

}
