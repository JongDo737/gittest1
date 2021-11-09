package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		//논리연산자 (&& ||) 엠퍼센트, 버티컬 바
		//관계 연산자와 혼합하여 많이 사용됨
		//연산의 결과가 true false
		
		int num1 = 10;
		int num2 = 20;
		
		//1. 논리곱(&&)
		boolean flag1 = (num1>0) && (num2>0);
		//참 && 참 = 참
		boolean flag2 = (num1>0) && (num2<0);
		//참 && 거짓 = 거짓
		
		//2. 논리합(||) 둘중 하나라도 true 면 참을 반환한다.
		boolean flag3 = (num1<0) || (num2>0);
		//거짓 || 참 = 참
		boolean flag4 = (num1<0) || (num2<0);
		//거짓 || 거짓 = 거짓
		
		
		
	}

}
