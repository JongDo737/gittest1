package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {

//	private JButton[] button= new JButton[6];
	// ArrayList�� �������ּ���
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	final int JBUTTON_SIZE = 16;

	// �����ذ�ɷ� C R U D
	// ���� �� ������� <---
	// 1. �������
	// 2. �߰��ϴ� ���
	// 3. ���� ����ϴ� ���

	public MyFrame2() { // ������
		initData();
		setInitLayout();
	}

	private void initData() { // ������ �ʱ�ȭ �޼���
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10)); // 1�� ����߷��� ��ġ

		// �迭�� ����ϴ� ���
//		for(int i=0;i<button.length;i++) {
//			button[i] = new JButton((i+1)+"��° ��ư");
//		}
//		button[0] = new JButton("1��° ��ư");
//		button[1] = new JButton("2��° ��ư");
//		button[2] = new JButton("3��° ��ư");
//		button[3] = new JButton("4��° ��ư");
//		button[4] = new JButton("5��° ��ư");
//		button[5] = new JButton("6��° ��ư");

		//ArrayList�� ó�� ����� 0�Դϴ�.
		//�׷��� i<buttons.size(); ���ƴϸ� ���� ���� 6�� �־�����Ѵ�.
		for (int i = 0; i < JBUTTON_SIZE; i++) {
			buttons.add(new JButton((i + 1) + "��° ��ư"));
		}

	}// end of initData

	private void setInitLayout() {
		setVisible(true);

		for (int i = 0; i < JBUTTON_SIZE; i++) {
			add(buttons.get(i));
		}
//		for (int i = 0; i < button.length; i++) {
//			this.add(button[i]);
//		}
//		this.add(button[0]);
//		this.add(button[1]);
//		this.add(button[2]);
//		this.add(button[3]);
//		this.add(button[4]);
//		this.add(button[5]);

	}// end of setInitLayout
}// end of myFrame2

public class FlowLayoutEx {
	public static void main(String[] args) {
		new MyFrame2();
	}
}