package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame{

	JButton button;
	JButton button2;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	private void initData() {
		setTitle("�͸�����ü ����غ���");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("�̺�Ʈ ��� �� ���");
		button2 = new JButton("�ȳ��ϼ���");
	}
	private void setInitLayout() {
		setVisible(true);
		add(button,BorderLayout.NORTH);
		add(button2,BorderLayout.SOUTH);
	}
	private void addEventListener() {
		
		ActionListener ac = new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {	
			System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");
			}
		
		//�͸� ���� ��ü
		// ��ȸ���� �������̽��� �͸� ���� ��ü�� ����� ����� �� �ִ�.
			
		};
		button.addActionListener(ac);
		button2.addActionListener(ac);
	}//end of addEventListener
//		button.addActionListener(new ActionListener() {
//			//�߻�޼��带 �Ϲ� �޼���� �����ߴ�.
//			public void actionPerformed(ActionEvent e) {			
//			}
//		});
//	}
	public static void main(String[] args) {
		
//		MyFrame4 mf = new MyFrame();
//		���� �ؿ� �ڵ忡�� 
//		mf.button.getText("�ȳ��ϼ���");
//		�̷���  ����� �� �ƴϸ� ���̺������� ���� �޸𸮿��� �÷��൵ ��
		
		//�͸� Ŭ����( �ν��Ͻ� ������ ���� ������ ���������� �����ؼ� ����� �ʿ����.
		new MyFrame4();
	}
}
