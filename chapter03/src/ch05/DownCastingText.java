package ch05;

public class DownCastingText {
	public static void main(String[] args) {
		
		//1. 바나나에 origin 멤버 변수를 추가
		
		Fruit fruit = new Banana();		//업캐스팅
		
		
//		fruit.origin;
		//컴파일러는 부모타입 인스턴스 변수 타입을
		//바라보고 있는 상태 그래서 바나나의 멤버변수를 사용할 수 없다.
		
		//다운 캐스팅을 사용한다면 가능
		//(컴파일러에게 자식 객체 타입으로 바라보라고 명시 (강제형변환이랑 비슷함)
		String origin = ((Banana)fruit).origin;
		System.out.println("원산지 : "+origin);
		
		//컴파일 타임
		
		//런타임
		
		
	}//end of main
}// end of class
