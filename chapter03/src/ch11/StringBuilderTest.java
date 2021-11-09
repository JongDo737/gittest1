package ch11;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		//StringBuilder , StringBuffer Ȱ��
		//���������� �������� char[]�� ��������� ����
		//���ڿ��� ������ �����ϰų� ������ �� ����ϸ� �����ϴ�.
		//StringBuffer�� ��Ƽ������ ���α׷��ֿ��� ����ȭ�� ����
		//���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		//��� : java
		System.out.println(System.identityHashCode(builder));
		//��� : �ּҰ�
		System.out.println("-------");
		builder.append(android);
		System.out.println(builder);
		//��� : javaandroid
		System.out.println(System.identityHashCode(builder));
		//��� �ּҰ� (���� ����)
		
		//���� 1. append �޼��� ����ؼ� 3�� �ּҰ� Ȯ���ϱ�
		builder.append("\n�ȳ��ϼ���");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("-------");
		builder.append("\n�ݰ����ϴ�.");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("-------");
		builder.append("\nHello");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		//builder�� ����ϸ� �ּҰ� ���� ��������� �ʰ� ���� �ּҷ� �����ȴ�.
		//�޸� ������ ����
		
		// ����2
//		String tempStr = builder;
		//tempStr �� ����Ÿ���� String�̰� builder�� ����Ÿ���� Stringbuilder�̱⶧����
		//����ȯ�� �ʿ��ϴ�.
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
	}
}
