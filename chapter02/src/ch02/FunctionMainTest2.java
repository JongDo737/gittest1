package ch02;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		//1
		sayHello("hi");
		//2
		System.out.println(calcSum());
		//3
		double addresult = addNum(3.7, 9.2);
		System.out.println(addresult);
		
		//4
		int intAdd_result = intAdd(10,30,50);
		System.out.println(intAdd_result);
		//5
		double doubleAdd_result = doubleAdd(10.6,9.4);
		System.out.println(doubleAdd_result);
		//6
		printArticle("안녕하세요 반감심미더");
	}// end of main

	// 1. 반환값이 없는 함수 설계하기
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	// 2. 매개변수가 없는 함수 만들기, 반환값 있음.
	public static int calcSum() {

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// 3.반환값이 있고 매개변수를 받는 함수 설계하기
	public static double addNum(double n1, double n2) {

		double result = 0.0;
		result = n1 + n2;

		return result;
	}

	//함수를 만들어보자.
	
	//4. 리턴값 int, 매개변수 n1,n2,n3, 이름 -> intAdd
	public static int intAdd(int n1, int n2,int n3) {
		int sum=0;
		sum = n1+n2+n3;
		return sum;
	}
	
	//5. 리턴값 double 매개변수 d1,d2 이름 -> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		double sum =0.0;
		sum =d1+d2;
		return sum;
	}
	//6. 리턴값 없음, 매개변수 String article 이름 -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	
	
	
	
	
	
	
}
