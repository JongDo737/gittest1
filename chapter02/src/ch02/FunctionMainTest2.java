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
		printArticle("�ȳ��ϼ��� �ݰ��ɹ̴�");
	}// end of main

	// 1. ��ȯ���� ���� �Լ� �����ϱ�
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	// 2. �Ű������� ���� �Լ� �����, ��ȯ�� ����.
	public static int calcSum() {

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// 3.��ȯ���� �ְ� �Ű������� �޴� �Լ� �����ϱ�
	public static double addNum(double n1, double n2) {

		double result = 0.0;
		result = n1 + n2;

		return result;
	}

	//�Լ��� ������.
	
	//4. ���ϰ� int, �Ű����� n1,n2,n3, �̸� -> intAdd
	public static int intAdd(int n1, int n2,int n3) {
		int sum=0;
		sum = n1+n2+n3;
		return sum;
	}
	
	//5. ���ϰ� double �Ű����� d1,d2 �̸� -> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		double sum =0.0;
		sum =d1+d2;
		return sum;
	}
	//6. ���ϰ� ����, �Ű����� String article �̸� -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	
	
	
	
	
	
	
}
