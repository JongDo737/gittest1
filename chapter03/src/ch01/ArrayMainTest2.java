package ch01;

public class ArrayMainTest2 {
	public static void main(String[] args) {
		// ������ �����͸� ������ ��Ƽ� �����ϱ� ���� ��
		int[] nums = new int[12];

		// ������ ���� �� �ִ� �迭�� 12ĭ ������ּ�����
		Zealot[] zealots = new Zealot[12];

		// ����
		Marine[] marines = new Marine[12];

		// ���۸�
		Zergling[] zerglings = new Zergling[12];

		// �迭�� for���� �Բ� ���� ���
		for (int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("����" + (i + 1));
		} // end of for

		// ���� ����
		for (int i = 0; i < marines.length; i++) {
			marines[i] = new Marine("����" + (i + 1));
		}

		// ���۸� ����
		for (int i = 0; i < zerglings.length; i++) {
			zerglings[i] = new Zergling("���۸�" + (i + 1));
		}

		// ���� 12������ ���� ����ϱ�
		for (int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}
		for(Zealot z : zealots) {
			z.showInfo();
		}
	
	
	
	
	
	}
}
