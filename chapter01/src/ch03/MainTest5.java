package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		//�������� (&& ||) ���ۼ�Ʈ, ��Ƽ�� ��
		//���� �����ڿ� ȥ���Ͽ� ���� ����
		//������ ����� true false
		
		int num1 = 10;
		int num2 = 20;
		
		//1. ����(&&)
		boolean flag1 = (num1>0) && (num2>0);
		//�� && �� = ��
		boolean flag2 = (num1>0) && (num2<0);
		//�� && ���� = ����
		
		//2. ����(||) ���� �ϳ��� true �� ���� ��ȯ�Ѵ�.
		boolean flag3 = (num1<0) || (num2>0);
		//���� || �� = ��
		boolean flag4 = (num1<0) || (num2<0);
		//���� || ���� = ����
		
		
		
	}

}
