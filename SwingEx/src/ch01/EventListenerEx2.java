package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyFrame2 extends SuperMyFrame implements ActionListener{
	//버튼 선언
	ArrayList<JButton> buttons;
	final int BUTTON_NUM = 5;
	public MyFrame2() {
		InitData();
		setInitLayout();
		addEventListener();
		
	}
	@Override
	protected void InitData() {
		setTitle("이벤트 리스너 연습2");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 배열 선언 
		buttons = new ArrayList<JButton>();
		for (int i = 0; i <BUTTON_NUM ; i++) {
			buttons.add(new JButton((i+1)+"번 버튼"));
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
//		System.out.println("버튼이 눌러졌습니다.");

		JButton clickedButton = (JButton)e.getSource();
//		System.out.println(clickedButton.getText());
		//getText() 버튼의 이름을 가져오는 메서드
		for(int i=0;i<buttons.size();i++) {
			if(clickedButton.getText().equals(buttons.get(i).getText())) {
				System.out.println((i+1)+"번이 클릭되었습니다.");
			}
		}
	}
	
}
public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();
	}
}
