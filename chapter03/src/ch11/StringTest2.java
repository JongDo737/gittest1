package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 한번 생성된 String은 불변(immutable)의 성질을 가짐
		
		//String을 연결하면 기존의 String에 연결되는 것이 아닌
		//새로운 문자열이 생성된다.
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		//System.identityHashCode(java) 주소값 확인하는 방법
		System.out.println(System.identityHashCode(java));
		
		//java = java + android;
		//.concat : 문자열을 연겷해주는 메서드
		java = java.concat(android);
		//javaandroid
		System.out.println(java);
		//새로운 주소값을 가진다.
		System.out.println(System.identityHashCode(java));
		
		//String 으로 채팅칠때 계속 new 를 써주게 되면 메모리 낭비가 심해진다.
		//계속 주소값이 생성되기 때문에
		
		
	}

}
