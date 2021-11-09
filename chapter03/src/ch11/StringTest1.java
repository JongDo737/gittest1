package ch11;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String 선언방식
		// heap 메모리에 인스턴스로 생성되는 경우
		String str1 = new String("abc");
		
		//data, static, 'constant pool'영역에 위치한다.
		String str2 = "abc";
		//둘다 데이터 타입이 같지만
		// 메모리에 올라가는 위치가 다름.
		
		String str3= "abc";
		
		
		//주소값이 출력되지 않고 값이 출력된다.
		System.out.println(str1);
		
		//false 메모리 영역이 다르기 때문에
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
		
		//heap메모리에 올라간 String 개수는 3개
		//다른 주소값을 만들고 하나씩 만든다.
		//constant pool 메모리에 올라간 String 개수는 1개
		//abc를 만들어놓고 같은 녀석을 계속 참조함
		
		//결론
		//heap 메모리는 생성될 때 마다 다른 주소값을 가지지만,
		//constant pool에 생성된 문자열은 모두 같은 주소값을 가진다.
		//(같은 문자열일 경우)
	}

}
