package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {

		String str = "10";
		String str2 = "11.5";
		String str3 = "true";

		// 8 + "" --> String
		byte b = Byte.parseByte(str);
		System.out.println("���ڿ� byte�� ��ȯ : " + b);

		int i = Integer.parseInt(str);
		System.out.println("���ڿ� int�� ��ȯ : " + i);

		short s = Short.parseShort(str);
		System.out.println("���ڿ� short�� ��ȯ : " + s);

		long l = Long.parseLong(str);
		System.out.println("���ڿ� long�� ��ȯ : " + l);

		float f = Float.parseFloat(str2);
		System.out.println("���ڿ� float�� ��ȯ : " + f);

		double d = Double.parseDouble(str2);
		System.out.println("���ڿ� double�� ��ȯ : " + d);

		boolean bool = Boolean.parseBoolean(str3);
		System.out.println("���ڿ� boolean�� ��ȯ : " + bool);

		// ���� 1
		String str10 = "1001";
		String str11 = "2001";

		// str10 �� str11�� ���� ����
		// str10 �� str11�� ���� ����

		int num1 = Integer.parseInt(str10) + Integer.parseInt(str11);
		System.out.println(num1);

		int num2 = Integer.parseInt(str10) * Integer.parseInt(str11);
		System.out.println(num2);
		
		//�ѱ۱��� Ȯ�� �ڵ� ~!!~!!~!
	}

}
