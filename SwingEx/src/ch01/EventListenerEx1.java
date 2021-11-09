package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



class MyFrame1 extends JFrame implements ActionListener{
	
	JButton button;
	JButton button2;
	
	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListender();
	}
	private void initData() {
		setTitle("�̺�Ʈ ������ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("button 1");
		button2 = new JButton("button 2");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
		add(button2);
	}
	private void addEventListender() {
		button.addActionListener(this);
		//��ư�� Ŭ���Ǹ� �߻�޼����� actionPerformed�� �����
		button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ý��� �ݹ� ����");	
		//�ý��� �ݹ��̶� 
		//������ �ü�� ���� ����� �Ѱ��� ���콺 ���� �Ǵ� Ű���� �ۼ� 
		//���� ��ư�� ������ ������ �˷��޶� �̷��ǹ�
		System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");
		System.out.println(e.toString());
	}
}

public class EventListenerEx1 {

	public static void main(String[] args) {
		
		new MyFrame1();

	}

}
