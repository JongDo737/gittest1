package ch11;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		//StringBuilder , StringBuffer 활용
		//내부적으로 가변적인 char[]를 멤버변수로 가짐
		//문자열을 여러번 연결하거나 변경할 때 사용하면 유용하다.
		//StringBuffer는 멀티쓰레드 프로그래밍에서 동기화를 보장
		//단일 쓰레드 프로그램에서는 StringBuilder 사용하기를 권장
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		//출력 : java
		System.out.println(System.identityHashCode(builder));
		//출력 : 주소값
		System.out.println("-------");
		builder.append(android);
		System.out.println(builder);
		//출력 : javaandroid
		System.out.println(System.identityHashCode(builder));
		//출력 주소값 (위와 동일)
		
		//문제 1. append 메서드 사용해서 3개 주소값 확인하기
		builder.append("\n안녕하세요");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("-------");
		builder.append("\n반값습니다.");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("-------");
		builder.append("\nHello");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		//builder을 사용하면 주소가 새로 만들어지지 않고 기존 주소로 유지된다.
		//메모리 관리에 좋음
		
		// 문제2
//		String tempStr = builder;
		//tempStr 의 참조타입은 String이고 builder의 참조타입은 Stringbuilder이기때문에
		//형변환이 필요하다.
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
	}
}
