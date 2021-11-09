package ch02;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame{

	public MyFrame6() {
		InitData();
		setInitLayout();
		addEventListener();
	}
	private void InitData() {
		setTitle("��� Ŭ���� �̿�");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	private void setInitLayout() {
		setVisible(true);
	}
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}
	
	
	// ����Ŭ���� ����
	//��͸� ����ؼ� �ʿ��� �޼��常 ����
	//�߻�Ŭ������ new Ű���带 ����Ҽ�����. --> Ŭ������ Ÿ�����θ� �����Ѵ�.
	//��� �����̶� �߻�޼��带 �� �����ϰ� ( �Ϲ� �޼���� �� ��ȯ)  { ��� ���� }
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("x : "+x);
			System.out.println("y : "+y);
		}
		
	}
	
	
	
	//�����Լ�
	public static void main(String[] args) {
		new MyFrame6();
	}//end of main
}
