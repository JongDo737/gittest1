package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = { "��", "����", "��", "��", "��" };
	String[] directions = {BorderLayout.NORTH,
			BorderLayout.CENTER,
			BorderLayout.SOUTH,
			BorderLayout.EAST,
			BorderLayout.WEST};
	
	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}
	//���� �ʱ�ȭ�ϴ� �޼���
	private void initData() {
		//�θ�Ŭ���� ���� ��ӹ��� �޼����
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		borderLayout = new BorderLayout();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
			
		}
	}
	//��ġ �ϴ� �޼���
	private void setInitLayout() {
		//ȭ���� ���̰�����
		setVisible(true);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i] );
		}
//		super.add(buttons[0], BorderLayout.NORTH );
//		super.add(buttons[1], BorderLayout.CENTER );
//		super.add(buttons[2], BorderLayout.SOUTH );
//		super.add(buttons[3], BorderLayout.EAST );
//		super.add(buttons[4], BorderLayout.WEST );
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	
}
