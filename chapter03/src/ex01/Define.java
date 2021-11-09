package ex01;

public class Define {

	//스테틱변수는 몰아넣어서 유지보수 편하게 이용하는게 좋다.
	public static final int MIN = 1;
	public static final int MAX = 9999;
	public static final double PI = 3.14;
	public static final String GREETING = "GoodMorning";
	public static final int MATH_CODE = 1001;
	
	//메인함수 ( 코드의 시작점 )
	public static void main(String[] args) {
		
//		Define define = new Define();
		//new 라는 키워드없이 class이름으로 사용할 수 있다. (static)
		System.out.println(Define.MIN);
		System.out.println(Define.MAX);
		System.out.println(Define.PI);
		System.out.println(Define.GREETING);
		System.out.println(Define.MATH_CODE);
	}
	
	
}
