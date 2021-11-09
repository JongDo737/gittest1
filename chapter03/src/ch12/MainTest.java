package ch12;

public class MainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"데미안","헤르만 헤세");
		Book book2 = new Book(2,"데미안","헤르만 헤세");

		
		System.out.println(book1 == book2);
		
		//equals ( 문자열을 비교할때 사용하는 메서드 ) : 주소값을 비교함
		//그래서 new로 생성한 String은 다르다 라고 나옴
		boolean result = "abc".equals("abc");
		System.out.println(result);
		//true
		System.out.println("a"=="a");
		
		
		//equals 메서드를 재정의 했다. (book 클래스 안에서)
		if(book1.equals(book2)) { 
			System.out.println("같은 책입니다.");
		}else {
			System.out.println("다른 책입니다.");
		}
		
	}

}
