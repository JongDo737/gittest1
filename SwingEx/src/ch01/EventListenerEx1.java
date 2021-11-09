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
		setTitle("이벤트 리스너 연습");
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
		//버튼이 클릭되면 추상메서드인 actionPerformed이 실행됨
		button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("시스템 콜백 실행");	
		//시스템 콜백이란 
		//윈도우 운영체제 한테 등록을 한거임 마우스 동작 또는 키보드 작성 
		//만약 버튼을 누르면 나한테 알려달라 이런의미
		System.out.println("버튼이 클릭되었습니다.");
		System.out.println(e.toString());
	}
}

public class EventListenerEx1 {

	public static void main(String[] args) {
		
		new MyFrame1();

	}

}
