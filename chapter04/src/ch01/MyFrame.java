package ch01;

import javax.swing.JFrame;
//GUI���α׷�
public class MyFrame extends JFrame{
		
	public MyFrame() {
		setTitle("ù��° GUI ���α׷� �ۼ�");		//���� ����
		setSize(400,400);	//ȭ�� ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//������ ����
		setVisible(true);		//������ȭ���� ���̰� �Ⱥ��̰�
	}
	public static void main(String[] args) {
		new MyFrame();
		
		
	}
}
