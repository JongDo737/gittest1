package ch03;

class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}
}

class Cal2 extends Cal {
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	//오버라이드 ( 부모에 있는 메서드를 필요에 의해서 재정의 해서 사용하는 개념 )
//	public int multiply(int n1, int n2) {
//		if(n1==0 || n2==0) {
//			System.out.println("0을 입력하지 마세요.");
//		}
//		return n1 * n2;
//	}
	
	//수기로 작성해도 되지만 자동완성 코드로 오버라이드
	@Override
	public int multiply(int n1, int n2) {
		if(n1==0 || n2==0) {
			System.out.println("0을 입력하지 마세요.");
		}
		return super.multiply(n1, n2);
		//super 부모클래스를 호출해주는 키워드
		//그래서 부모클래스의 코드를 추가 할 필요없이 새로 추가할 내용만 넣으면 된다.
	}
}


public class MainTest2 {
	public static void main(String[] args) {

		Cal2 c = new Cal2();
		System.out.println(c.sum(5,3));
		System.out.println(c.minus(7,2));
		System.out.println(c.multiply(10,0));
	}
}
