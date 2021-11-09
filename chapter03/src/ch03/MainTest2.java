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
	//�������̵� ( �θ� �ִ� �޼��带 �ʿ信 ���ؼ� ������ �ؼ� ����ϴ� ���� )
//	public int multiply(int n1, int n2) {
//		if(n1==0 || n2==0) {
//			System.out.println("0�� �Է����� ������.");
//		}
//		return n1 * n2;
//	}
	
	//����� �ۼ��ص� ������ �ڵ��ϼ� �ڵ�� �������̵�
	@Override
	public int multiply(int n1, int n2) {
		if(n1==0 || n2==0) {
			System.out.println("0�� �Է����� ������.");
		}
		return super.multiply(n1, n2);
		//super �θ�Ŭ������ ȣ�����ִ� Ű����
		//�׷��� �θ�Ŭ������ �ڵ带 �߰� �� �ʿ���� ���� �߰��� ���븸 ������ �ȴ�.
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
