package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {

		String str = "10";
		String str2 = "11.5";
		String str3 = "true";

		// 8 + "" --> String
		byte b = Byte.parseByte(str);
		System.out.println("문자열 byte값 변환 : " + b);

		int i = Integer.parseInt(str);
		System.out.println("문자열 int값 변환 : " + i);

		short s = Short.parseShort(str);
		System.out.println("문자열 short값 변환 : " + s);

		long l = Long.parseLong(str);
		System.out.println("문자열 long값 변환 : " + l);

		float f = Float.parseFloat(str2);
		System.out.println("문자열 float값 변환 : " + f);

		double d = Double.parseDouble(str2);
		System.out.println("문자열 double값 변환 : " + d);

		boolean bool = Boolean.parseBoolean(str3);
		System.out.println("문자열 boolean값 변환 : " + bool);

		// 문제 1
		String str10 = "1001";
		String str11 = "2001";

		// str10 과 str11을 덧셈 연산
		// str10 과 str11을 곱셈 연산

		int num1 = Integer.parseInt(str10) + Integer.parseInt(str11);
		System.out.println(num1);

		int num2 = Integer.parseInt(str10) * Integer.parseInt(str11);
		System.out.println(num2);
		
		//한글깨짐 확인 코드 ~!!~!!~!
	}

}
