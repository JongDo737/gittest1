package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyFrame2 extends SuperMyFrame implements ActionListener{
	//��ư ����
	ArrayList<JButton> buttons;
	final int BUTTON_NUM = 5;
	public MyFrame2() {
		InitData();
		setInitLayout();
		addEventListener();
		
	}
	@Override
	protected void InitData() {
		setTitle("�̺�Ʈ ������ ����2");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ư �迭 ���� 
		buttons = new ArrayList<JButton>();
		for (int i = 0; i <BUTTON_NUM ; i++) {
			buttons.add(new JButton((i+1)+"�� ��ư"));
		}
		
	}
	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
		super.setInitLayout();
	}
	@Override
	protected void addEventListener() {
		for(int i=0;i<buttons.size();i++) {
			buttons.get(i).addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� ���������ϴ�.");

		JButton clickedButton = (JButton)e.getSource();
//		System.out.println(clickedButton.getText());
		//getText() ��ư�� �̸��� �������� �޼���
		for(int i=0;i<buttons.size();i++) {
			if(clickedButton.getText().equals(buttons.get(i).getText())) {
				System.out.println((i+1)+"���� Ŭ���Ǿ����ϴ�.");
			}
		}
	}
	
}
public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();
	}
}
